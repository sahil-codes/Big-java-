import java.util.Scanner;

public class Cookies

{
  public static void main(String[] args ) 

{
   double cookies , cupofSugar , cupofButter , cupofFlour;
 
  
  Scanner scan = new Scanner(System.in);
 
  System.out.print("Enter the number of cookies :  ");
  cookies = scan.nextDouble();
  
  System.out.println("To make " + cookies + " you will need :  ");

  cupofSugar = (1.5/48)*cookies;

  cupofButter = (1.0/48)*cookies;
 
  cupofFlour = (2.75/48)*cookies;

  System.out.println(+ cupofSugar + " Cups of Sugar ");
 
  System.out.println(+ cupofButter + " Cups of Butter ");

  System.out.println(+ cupofFlour + " Cups of Flour ");
 
 

 }

}
// This code is contributed by Sahil Ranmbail

 
  
 
  
  

  
