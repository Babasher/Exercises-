import java.util.Scanner;
import java.util.Random;
/*
 * While loops
 * 
 */
public class GuessingGame {
  public static void main(String[] args)
  {
   Random random = new Random();
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Please enter an integer between 1 and 20 (inclusive)");
   int guess = sc.nextInt();
   int rand = random.nextInt( 20 ) + 1;
   
   System.out.println(rand);
   
   while( guess != rand)
   {
    System.out.println("I'm sorry that isn't correct, please try again");
    System.out.println("Please enter an integer between 1 and 20 (inclusive)");
    guess = sc.nextInt();
     
   }
   
  
  }
  
}