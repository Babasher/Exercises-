/* Printf method demo
 * MCS 141
 * 9/15/2016
*/

public class PrintfDemo
{
  public static void main(String [] args)
  {
    String name = "Mr. Sprague";
    int age = 34;
    
    // Comparison of printf and println
    
    System.out.println( name + "\'s favorite number is " +  Math.PI + " and his age is " + age + ".");
    System.out.printf("%s's favorite number is %f and his age is %d.%n", name, Math.PI, age);
    
    String name2 = "Mr. Reed";
    String name3 = "Mr Kurup";
    int score = 7;
    int score2 = 156;
    int score3 = 145525;
    
    System.out.printf("%-20s|%20s%n", "Name", "Score"); // min width of 20 for each column, - is left justified
    System.out.printf("%-20s|%20d%n", name, score);
    System.out.printf("%-20s|%20d%n", name2, score2);
    System.out.printf("%-20s|%20d%n", name3, score3);
    
    double GPA = 32.0/9.0; 
    double oneThird = 1.0/3.0;
    
    // print GPA rounded to one decimal place with minimum width 6
    // print oneThird as a percent rounded to two decimal places (33.33%)
    
    System.out.printf("%6.1f%n", GPA);
    System.out.printf("%.2f%%%n", oneThird * 100);
    
  }
}
    
    