/*
Roberto Cardenas
Professor Mimi Rasky
Math 130
Circle
February 9, 2018
*/

import java.util.*;

public class Circle
{
   public static void main(String[] args)
   {
      //Variable/Object declarations
      Scanner input = new Scanner(System.in);
      int rInch1, rInch2, rInch3, rInch4, rInch5;
      double rCm1, rCm2, rCm3, rCm4, rCm5;
      double area1, area2, area3, area4, area5;
      double circum1, circum2, circum3, circum4, circum5;
      double rAvg;
    
      
      //Collecting User Input
      System.out.print("Please enter an integer radius measurement (in inches):");
      rInch1 = input.nextInt();
      
      System.out.print("Please enter an integer radius measurement (in inches):");
      rInch2 = input.nextInt();
      
      System.out.print("Please enter an integer radius measurement (in inches):");
      rInch3 = input.nextInt();
      
      System.out.print("Please enter an integer radius measurement (in inches):");
      rInch4 = input.nextInt();
      
      System.out.print("Please enter an integer radius measurement (in inches):");
      rInch5 = input.nextInt();
      
      //Convert input into centimeteres
      rCm1 = rInch1 * 2.54;
      rCm2 = rInch2 * 2.54;
      rCm3 = rInch3 * 2.54;
      rCm4 = rInch4 * 2.54;
      rCm5 = rInch5 * 2.54;
      
      //Calculate Area and Perimeter
      area1 = Math.PI * Math.pow(rCm1,2);
      circum1 = 2 * Math.PI * rCm1;
      
      area2 = Math.PI * Math.pow(rCm2,2);
      circum2 = 2 * Math.PI * rCm2;
      
      area3 = Math.PI * Math.pow(rCm3,2);
      circum3 = 2 * Math.PI * rCm3;
      
      area4 = Math.PI * Math.pow(rCm4,2);
      circum4 = 2 * Math.PI * rCm4;
      
      area5 = Math.PI * Math.pow(rCm5,2);
      circum5 = 2 * Math.PI * rCm5;
      
      //Calculate radii average
      rAvg = (double)(rInch1 + rInch2 + rInch3 + rInch4 + rInch5) / 5;
      
      //Display Output Header
      System.out.println();
      System.out.println("Radius (in.) Radius (cm.) Area (sq. sm.) Circumference (cm.)");
      System.out.println("___________________________________________________________ ");
      System.out.println();
      
      //Display Output
      System.out.printf("%7d%13.1f%14.1f%14.1f\n", rInch1, rCm1, area1, circum1);
      System.out.printf("%7d%13.1f%14.1f%14.1f\n", rInch2, rCm2, area2, circum2);
      System.out.printf("%7d%13.1f%14.1f%14.1f\n", rInch3, rCm3, area3, circum3);
      System.out.printf("%7d%13.1f%14.1f%14.1f\n", rInch4, rCm4, area4, circum4);
      System.out.printf("%7d%13.1f%14.1f%14.1f\n", rInch5, rCm5, area5, circum5);
      System.out.println();
      System.out.printf("The average of all of the radii is: %.1f inches.\n", rAvg);
      
      
   }
}