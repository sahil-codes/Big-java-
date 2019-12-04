public class DigitsLab4
{

     public static void main(String[] args)

    {
  
    int x = 16384;

    int num1 =  x  /  10000 % 10;

    int num2 =  x  /  1000 % 10;

    int num3 =  x  /  100 % 10;

    int num4 =  x  /  10 % 10;
 
    int num5 =  x  /  1 % 10;

    System.out.println(" These are the following sequence :   " + num1  + "  "   + num2 + "   "  + num3 +"  "  + num4 +"  "  + num5  );

    }

}
  


  
   