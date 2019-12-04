import java .util.Scanner;

public class ExpressionsLab4
{

  public static void main(String[] args)

{


   double n , m , N , M , X , Z , I ,J;


   n = 17;
   m = 18;

 Scanner scan = new Scanner(System.in);

 System.out.println("Enter First Number :  ");

 N = scan.nextDouble();

 System.out.println("Enter Second Number :  ");

 M = scan.nextDouble();

 N = n / 10 + n % 10;

 M = n % 2 + m % 2; 

 X = (m+n)/2;

 Z = (m+n)/2.0; 

 I = (0.5*(m+n));

 J = (Math.round(0.5*(m+n)));

 System.out.println(" n / 10 + n % 10 =  " + N +"\n");

 System.out.println("n % 2 + m % 2 =  " + M + "\n");

 System.out.println("(m+n)/2 =  " + X + "\n");

 System.out.println("(m+n)/2.0 =  " + Z + "\n");

 System.out.println("(0.5*(m+n) =  " + I + "\n");

 System.out.println("Math.round(0.5*(m+n)) =  " + J + "\n");



}

}

 