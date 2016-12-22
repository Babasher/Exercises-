/*
 * Conversion dealing with money
 */
public class MakeChange{
  public static void main(String []args)
  {
   int cents = 142; 
   int quarters = cents / 25;
   int remainder = cents % 25;
   int dimes = remainder / 10;
   remainder = remainder % 10; 
   int nickels = remainder / 5;
   int pennies = remainder % 5;
   int coins = quarters + dimes + nickels + pennies;
   System.out.println(coins + " coins"); 
   System.out.println(quarters + " Quarters");
   System.out.println(dimes + " dimes");
   System.out.println(nickels + " nickels");
   System.out.println(pennies + " pennies");
    
    
    
  }
}