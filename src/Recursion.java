import java.util.*;
public class Recursion{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number please");
  int input = greaterThanTen(sc.nextInt());
  
  int sum = OnetoX(input);
  System.out.println(sum);

    
  }
  
  public static int greaterThanTen(int x){
   Scanner sc = new Scanner(System.in);
   if(x<=10){ 
     System.out.println("Enter a number greater than 10 please");
     return greaterThanTen(sc.nextInt());
   }else{
   return x;
   }
  }
  
  public static int OnetoX(int x){
    if(x==1){
      return 1; //breaks after OnetoX(2-1) is called 
    }else{
      return x+OnetoX((x-1));
    }
  }

}