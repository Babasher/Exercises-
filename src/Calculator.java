import java.util.Scanner;
public class Calculator {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	boolean contin = true;
	double accumulator = 0.0;
	double input;
	while(contin)
	{
		System.out.println("Accumulator = "+accumulator);
		System.out.println("Please Choose one of the following options");
		System.out.println("0) Exit");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("5) Square Root");
		System.out.println("6) Reset");
		
		int choice = 0;
		System.out.print("What is your choice? ");
		choice = sc.nextInt();
		if(choice == 0)
		{
			contin = false;
		}
		else if(choice ==1)
		{
			//do addition
			System.out.println("Enter a number ");
			input=sc.nextDouble();
			accumulator = accumulator + input;
		}
		else if(choice ==2)
		{
			// do subtraction
			System.out.println("Enter a number ");
			input=sc.nextDouble();
			accumulator = accumulator - input;
		}
		else if(choice ==3)
		{
			// do multiplication
			System.out.println("Enter a number ");
			input=sc.nextDouble();
			accumulator = accumulator * input;
		}
		else if(choice ==4)
		{
			//do division
			System.out.println("Enter a number ");
			input=sc.nextDouble();
			accumulator= accumulator/input;
		}
		else if(choice ==5)
		{
			if(accumulator>0)
			{
			accumulator = Math.sqrt(accumulator);
			}
		}
		else if(choice ==6)
		{
			accumulator= 0;
		}
		else{
			System.out.println("Illegal opperation: "+choice);
		}
		
	}
}
}
