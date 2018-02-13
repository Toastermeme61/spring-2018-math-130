/*
Roberto Cardenas
Professor Mimi Rasky
Math 130
Java Project #1
February 15, 2018
*/
import java.util.*; //For Scanner

public class Project1
{
   public static void main(String[] args)
   {
      //Variable/Object declarations
      Scanner input = new Scanner(System.in);
      double rate, hoursWorked, grossPay, netPay;
      double ficaWithhold, fedIncWithhold, stateIncWithhold;
      double disInsurance, costToEmployer;
      
      //Get user input
      System.out.print("Enter hourly pay rate in dollars and cents --> ");
      rate = input.nextDouble();
      
      System.out.print("Enter number of hours and tenths worked --> ");
      hoursWorked = input.nextDouble();
      
      //Calculate gross pay
      grossPay = rate * hoursWorked;
      
      //Calculate employee/employer withholdings
      fedIncWithhold = grossPay * 0.25;
      stateIncWithhold = grossPay * 0.09075;
      ficaWithhold = grossPay * 0.0765;
      disInsurance = grossPay * 0.02;
      
      //Calculate net pay
      netPay = grossPay - (fedIncWithhold + stateIncWithhold + ficaWithhold);
      
      //Calculate cost to employer
      costToEmployer = grossPay + ficaWithhold + disInsurance;
      
      //Display Output
      System.out.println();
      System.out.printf("%30s\n","PAYROLL REPORT");
      
      System.out.printf("Rate:%40.2f\n", rate);
      System.out.printf("Hours:%38.1f\n", hoursWorked);
      System.out.println();
      
      System.out.printf("Gross pay:%35.2f\n", grossPay);
      System.out.printf("Federal Tax:%33.2f\n", fedIncWithhold);
      System.out.printf("State Tax:%35.2f\n", stateIncWithhold);
      System.out.printf("FICA:%40.2f\n", ficaWithhold);
      System.out.printf("Net Pay:%37.2f\n", netPay);
      System.out.println();
      
      System.out.printf("Employer's FICA contribution:%16.2f\n", ficaWithhold);
      System.out.printf("Employer's UEI and DI contribution:%10.2f\n", disInsurance);
      System.out.printf("Cost to Employer:%28.2f\n", costToEmployer);
   }
}