/*
Roberto Cardenas
Professor Mimi Rasky
Math 130
Lab#3
February 23, 2018
*/
import java.util.*; //For Scanner

public class Lab3
{
   public static void main(String[] args)
   {
      //Variable/Object declarations
      Scanner input = new Scanner(System.in);
      int userNum;
      
      //PART 1: INT DIVIDES ITSELF
      
      //Get user input
      System.out.print("Enter an integer value with no more than 3 digits: ");
      userNum = input.nextInt();
      
      //Check how many digits are in userNum
      if(userNum / 100 != 0) 
      {
         /*
         Conditions in the if-statement where separated for readability
         First line checks if the first digit divides evenly
         Second line checks if second digit != 0 and if it divides evenly
         Third line checks if third digit is != 0  and if it divides evenly
         */
         if(userNum % (userNum / 100) == 0 
            && userNum % 100 / 10 != 0 && userNum % (userNum % 100 / 10) == 0 
            && userNum % 100 % 10 != 0 && userNum % (userNum % 100 % 10) == 0)
            
            System.out.printf("The number %d divides itself", userNum);
         else
            System.out.printf("The number %d does NOT divide itself", userNum);
      }
      else if(userNum / 10 != 0) 
      {
         /*
         Conditions in the if-statement where separated for readability
         First line checks if the first digit divides evenly
         Second line checks if second digit != 0 and if it divides evenly
         */
         if(userNum % (userNum % 100 / 10) == 0 
            && userNum % 100 % 10 != 0 && userNum % (userNum % 100 % 10) == 0)
            
            System.out.printf("The number %d divides itself", userNum);
         else
            System.out.printf("The number %d does NOT divide itself", userNum);
      }
      else 
      {
         //Since its a single digit it will always divide itself unless its a zero
         if(userNum % 100 % 10 != 0) 
            System.out.printf("The number %d divides itself", userNum);
         else
            System.out.printf("The number %d does NOT divide itself", userNum);
      }
      
   }
}