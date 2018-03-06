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
      String whiteSpace = "", hashSpace = "";
      
      //Priming read
      System.out.print("Height: ");
      height = input.nextInt();
      
      //Infinite loop for now
      while(true)
      {
         //Checks if height is within desired range
         if(height > 0 && height <= 23)
         {
            //Each iteration takes care of one row of the pyramid
            for(int x = 0; x < height; x++)
            {
               //Determine number of hashes and whitespace per row, depends on height and row number
               for(int i = 0; i < (x + 1); i++)
                  hashSpace += "#";
               for(int i = 0; i < (height - (x + 1)); i++)
                  whiteSpace += " ";
               
               //Print current row
               System.out.printf("%s%s  %s\n", whiteSpace, hashSpace, hashSpace);
               
               //Reset variables
               whiteSpace = "";
               hashSpace = "";
            }
         }
         //Get next input
         System.out.print("Height: ");
         height = input.nextInt();
      }
   }
}