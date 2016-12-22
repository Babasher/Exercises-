
public class TemperatureConversion {
	
		   public static void main( String [] args )
		   {
		      //***** 1. declare any constants here
			
					
		      //***** 2.  declare temperature in Fahrenheit as an int 
			  int fahrenheit = 100;
			  		
		      //***** 3. calculate equivalent Celsius temperature	
			  double CCalculation = (fahrenheit - 32) * .556;
			  		
		      //***** 4. output the temperature in Celsius
			   System.out.println(CCalculation + " Celcius");
														  
		      //***** 5. convert Celsius temperature back to Fahrenheit
			  double fCalculation = (CCalculation * 1.8) + 32;
						
		      //***** 6. output Fahrenheit temperature to check correctness 
			  System.out.println(fCalculation+ " Fahrenheit");
			  
						
		   }
		
}
