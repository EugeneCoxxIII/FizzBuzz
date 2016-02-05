import java.util.Scanner;

public class FizzBuzz
{
   public static void main(String[]args)
   {
      Scanner user_input = new Scanner( System.in );
      String Fizz = "fizz", Buzz = "buzz";
      int continueNum = 1, inputNum = 0;
      String inputString = "";
      
      while (continueNum == 1)
      {
         System.out.print("Please enter a whole number:  ");
         inputString = user_input.nextLine(); 
         inputNum = Integer.parseInt(inputString);
         if(inputNum%15 == 0)
         {
            System.out.println(Fizz+Buzz);
         }
         else if(inputNum%5 == 0)
         {
            System.out.println(Buzz);
         }
         else if(inputNum%3 == 0)
         {
            System.out.println(Fizz);
         }
         else
         {
            System.out.println(inputNum);
         }
         
         System.out.print("Do you wish to continue? 1 = yes, 2 = no : ");
         inputString = user_input.nextLine();
         continueNum = Integer.parseInt(inputString);
      }
   }

}