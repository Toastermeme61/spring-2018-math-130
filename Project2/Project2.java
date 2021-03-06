/*
Roberto Cardenas
Professor Mimi Rasky
Math 130
Java Project #2
March 2, 2018
*/
import java.util.*;

public class Project2
{
   public static void main(String[] args)
   {
      //Variable/Object/Constant Declarations
      Scanner input = new Scanner(System.in);
      final double OVERTIME_RATE =1.5, FED_TAX = 0.25, STATE_TAX = 0.09075;
      final double FICA_RATE = 0.0765, INSURANCE_RATE = 0.02;
      final int NORMAL_HOURS = 40;
      double rate, hoursWorked, grossPay, netPay;
      double ficaWithhold, fedIncWithhold, stateIncWithhold;
      double disInsurance, costToEmployer;
      boolean workedOvertime;
      
      //Priming read
      System.out.print("Enter hourly pay rate in dollars and cents --> ");
      rate = input.nextDouble();
      
      while(rate > 0)
      {
         //Get amount of hours worked
         System.out.print("Enter number of hours and tenths worked --> ");
         hoursWorked = input.nextDouble();
         
         //Check if Employee worked overtime and calculate grossPay
         workedOvertime = false;
         if( hoursWorked <= NORMAL_HOURS)
            grossPay = hoursWorked * rate;
         else
         {
            grossPay = (rate * NORMAL_HOURS) + (hoursWorked - NORMAL_HOURS) 
                     * (rate * OVERTIME_RATE);
            workedOvertime = true;
         }
         //Calculate employee/employer withholdings
         fedIncWithhold = grossPay * FED_TAX;
         stateIncWithhold = grossPay * STATE_TAX;
         ficaWithhold = grossPay * FICA_RATE;
         disInsurance = grossPay * INSURANCE_RATE;
         
         //Calculate net pay
         netPay = grossPay - (fedIncWithhold + stateIncWithhold + ficaWithhold);
      
         //Calculate cost to employer
         costToEmployer = grossPay + ficaWithhold + disInsurance;
      
         //Display Output
         System.out.println();
         System.out.printf("Rate:%40.2f\n", rate);
         System.out.printf("Hours:%38.1f\n", hoursWorked);
         System.out.println();
         
         //Check if worked overtime and print appropriate text
         if(workedOvertime)
            System.out.printf("Gross pay:%35.2f   includes overtime\n", grossPay);
         else
            System.out.printf("Gross pay:%35.2f\n", grossPay);
            
         System.out.printf("Federal Tax:%33.2f\n", fedIncWithhold);
         System.out.printf("State Tax:%35.2f\n", stateIncWithhold);
         System.out.printf("FICA:%40.2f\n", ficaWithhold);
         System.out.printf("Net Pay:%37.2f\n", netPay);
         System.out.println();
      
         System.out.printf("Employer's FICA contribution:%16.2f\n", ficaWithhold);
         System.out.printf("Employer's UEI and DI contribution:%10.2f\n", disInsurance);
         System.out.printf("Cost to Employer:%28.2f\n", costToEmployer);
         System.out.println();
         
         //Get pay rate for next Employee
         System.out.print("Enter hourly pay rate in dollars and cents --> ");
         rate = input.nextDouble();
      }
   }
}