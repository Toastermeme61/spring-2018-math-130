/*
Roberto Cardenas
Professor Mimi Rasky
Math 130
Java Project #1
February 15, 2018
*/
import java.util.*;//For Random
public class DiceGame
{
   public static void main(String[] args)
   {
      //Object/Variable declarations
      Random rand = new Random();
      int loadedDie, fairDie;
      int userScore = 0, computerScore = 0, ties = 0;
      int computerProduct, userProduct;
      
      for(int i = 0; i < 15; i++)
      {
         //Computer rolls both its dice
         //Roll fair die
         fairDie = rand.nextInt(9) + 1;
         
         //Roll loaded die
         loadedDie = rand.nextInt(100);
         
         //Ranges are written in set notation
         //[0,57) -> 9; 57 - 0 = 57%
         if(loadedDie < 57)
            loadedDie = 9;
         //[57,64) -> 8; 64 - 57 = 7%
         else if(loadedDie < 64)
            loadedDie = 8;
         //[64,70) -> 7; 70 - 64 = 6%
         else if(loadedDie < 70)
            loadedDie = 7;
         //[70,75) -> 6; 75 - 70 = 5%
         else if(loadedDie < 75)
            loadedDie = 6;
         //[75,80) -> 5; 80 - 75 = 5%
         else if(loadedDie < 80)
            loadedDie = 5;
         //[80,85) -> 4; 85 - 80 = 5%
         else if(loadedDie < 85)
            loadedDie = 4;
         //[85,90) -> 3; 90 - 85 = 5%
         else if(loadedDie < 90)
            loadedDie = 3;
         //[90,95) -> 2; 95 - 90 = 5%
         else if(loadedDie < 95)
            loadedDie = 2;
         //[95,100) -> 1; 100 - 95 = 5%
         else
            loadedDie = 1;
         
         //Calculate product
         computerProduct = fairDie * loadedDie;
         
         //Print result for this round
         System.out.printf("Computer Turn Round #%d\n", i + 1);
         System.out.println("- - - - - - - - - - - - - - -");
         System.out.printf("Normal Die: %d\n", fairDie);
         System.out.printf("Loaded Die: %d\n", loadedDie);
         System.out.printf("Product: %4d\n", computerProduct);
         System.out.println();
         
         //User rolls both of there dice
         //Roll fair die
         fairDie = rand.nextInt(9) + 1;
         
         //Roll loaded die
         loadedDie = rand.nextInt(100);
         
         //Ranges are written in set notation
         //[0,57) -> 9; 57 - 0 = 57%
         if(loadedDie < 57)
            loadedDie = 9;
         //[57,64) -> 8; 64 - 57 = 7%
         else if(loadedDie < 64)
            loadedDie = 8;
         //[64,70) -> 7; 70 - 64 = 6%
         else if(loadedDie < 70)
            loadedDie = 7;
         //[70,75) -> 6; 75 - 70 = 5%
         else if(loadedDie < 75)
            loadedDie = 6;
         //[75,80) -> 5; 80 - 75 = 5%
         else if(loadedDie < 80)
            loadedDie = 5;
         //[80,85) -> 4; 85 - 80 = 5%
         else if(loadedDie < 85)
            loadedDie = 4;
         //[85,90) -> 3; 90 - 85 = 5%
         else if(loadedDie < 90)
            loadedDie = 3;
         //[90,95) -> 2; 95 - 90 = 5%
         else if(loadedDie < 95)
            loadedDie = 2;
         //[95,100) -> 1; 100 - 95 = 5%
         else
            loadedDie = 1;
         
         //Calculate product
         userProduct = fairDie * loadedDie;
         
         //Print result for this round
         System.out.printf("User Turn Round #%d\n", i + 1);
         System.out.println("- - - - - - - - - - - - - - -");
         System.out.printf("Normal Die: %d\n", fairDie);
         System.out.printf("Loaded Die: %d\n", loadedDie);
         System.out.printf("Product: %4d\n", userProduct);
         System.out.println();
         
         //Figure out who wins round
         if(userProduct > computerProduct)
         {
            System.out.println("The User wins this round!!!!!");
            userScore++;
         }
         else if(userProduct == computerProduct)
         {
            System.out.println("Tie game!");
            ties++;
         }
         else
         {
            System.out.println("The Computer wins this round!!!!!");
            computerScore++;
         }
         System.out.println();
      }
      
      //Print out final results
      System.out.printf("Total Number of Computer Wins: %d\n", computerScore);
      System.out.println();
      System.out.printf("Total Number of User Wins: %d\n", userScore);
      System.out.println();
      System.out.printf("Total Number of Tie Games: %d\n", ties);
      System.out.println();
      if(userScore > computerScore)
         System.out.println("The User is the GRAND CHAMPION!!!!!");
      else if(userScore < computerScore)
         System.out.println("The Computer is the GRAND CHAMPION!!!!!");
      else
         System.out.println("Overal tie between contestants...");
      
   }
}