/* Conversion Demo
 * MCS 141
 * 9/1/2016
 * */

public class ConversionDemo {
  
  public static void main (String [] args){
    // convert 6 inches to centimeters
    int inches = 6;
    final double CM_IN_INCH = 2.54;
    final double cm = inches * CM_IN_INCH; 
    System.out.println("There are " +cm+ " Cm in " + inches +" inches");
    
    //Convert 207 minutes to hours and minutes
    // 3 hours and 27 minutes
    int minutes = 207;
    int hours;
    int endMInutes;
    
    hours = minutes/60;
    int endMinutes = minutes%60;
    
    System.out.println("There are "+hours+ " hours and "  + endMinutes +  " minutes in " + minutes + " minutes");
    
    
  }
}
