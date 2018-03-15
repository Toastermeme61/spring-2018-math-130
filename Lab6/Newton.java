/*
Roberto Cardenas
Professor Mimi Rasky
Math 130
Java Project #1
February 15, 2018
*/
import java.util.*;
public class Newton
{
   public static void main(String[] args)
   {
      //Object/Variable/Constant declarations
      Scanner input = new Scanner(System.in);
      int i = 1;
      double currentAproximation, userNum;
      final double EPSILON = 0.00006639;
      
      //Get input
      System.out.print("Enter a positive number that you want to find the square root: ");
      userNum = input.nextDouble();
      
      //Calculate initial aproximation
      currentAproximation = userNum / 2;
      
      //Display initial aproximation and intermediate aproximations header
      System.out.println();
      System.out.printf("Initial approximation R0 = %.6f\n", currentAproximation);
      System.out.println();
      System.out.println("Intermediate aproximations:");
      
      while(Math.abs(userNum - Math.pow( currentAproximation, 2)) >= EPSILON)
      {
         //Calculate and display intermediate aproximations
         currentAproximation = newton(userNum, currentAproximation);
         System.out.printf("R%d = %.6f\n", i, currentAproximation);
         i++;
      }
      
      //Print final output
      System.out.println();
      System.out.printf("Final Result - The square root of %f is: %.6f\n", userNum, currentAproximation);
   }
   public static double newton(double X, double R)
   {
      return (R + (X / R)) / 2;
   }
}