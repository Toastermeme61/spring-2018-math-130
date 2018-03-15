/*
Roberto Cardenas
Professor Mimi Rasky
Math 130
Lab #4
March 9, 2018
*/
import java.util.*;//For Scanner
public class SuperMario
{
   public static void main (String [] args)
   {
      //Variable/Object declarations
      int height;
      Scanner input = new Scanner(System.in);
      
      //Get input
      System.out.print("Height: ");
      height = input.nextInt();
      
      //Checks if height is within desired range
      if(height > 0 && height <= 23)
      {
         //Each iteration takes care of one row of the pyramid
         for(int x = 0; x < height; x++)
         {
            //Prints whitespace needed
            for(int i = 0; i < (height - (x+1)); i++)
               System.out.print(" ");
               
            //Prints first group of hashes
            for(int i = 0; i < (x + 1); i++)
               System.out.print("#");
               
            //Two spaces between hashes
            System.out.print("  ");
            
            //Print second group of hashes
            for(int i = 0; i < (x + 1); i++)
               System.out.print("#");
              
            System.out.println();
               
            //ALTERNATIVE WAY USING STRINGS
            /*
            String whiteSpace = "", hashSpace = "";
            
            //Determine number of hashes and whitespace per row
            for(int i = 0; i < (x + 1); i++)
               hashSpace += "#";
            for(int i = 0; i < (height - (x + 1)); i++)
               whiteSpace += " ";
               
            //Print current row
            System.out.printf("%s%s  %s\n", whiteSpace, hashSpace, hashSpace);
               
            //Reset variables
            whiteSpace = "";
            hashSpace = "";
            */
            
         }
      }
   }
}