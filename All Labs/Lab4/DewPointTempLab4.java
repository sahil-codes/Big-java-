import java.util.Scanner;

public class DewPointTempLab4
{
	
	
		 public static void main(String[] args )
		 
   {
		 
		 double a = 17.27;
		  
		 double b = 237.7;
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please Enter the Relative Humidity (between 0 and 1 :  ");
		 double RH = scan.nextDouble();
		 
		 System.out.printf("Please Enter the Temperature (in degrees C) :  " + "C");
		 double T = scan.nextDouble();
		 
		 double f;
		 
		 f = ((a*T)/(b+T)+Math.log(RH));
		 
		 System.out.println("f(T,RH) =   " + f);
		 
		 
   }
   
   
}