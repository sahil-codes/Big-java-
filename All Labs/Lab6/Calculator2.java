import java.util.Scanner;

  public class Calculator2

{ 
     public static void main (String[] args)
	
	{
		
	Scanner in = new Scanner(System.in);
    char operator;
    double first, second , c , ans ;
    System.out.println("Enter an operator (+, -, *, / , P , S): ");
	operator = in.next().charAt(0);
	
    System.out.println("Enter first operand: ");
    first = in.nextDouble();
	
	System.out.println("Enter Second operand: ");
	second = in.nextDouble();
	
	if (operator=='+')    
		
 {   
       ans = first + second;
       System.out.println("Sum = " + ans);
 }
  else if (operator=='-')  
	  
 {      
      ans = first - second;
      System.out.println("Sub =  " + ans);
 }  
  else if (operator=='/')    
 {
      ans = first / second;
	  System.out.println("Division =  " + ans);
	  
 }   
 else if (operator=='*')   
	 
  {
      ans = first * second;
	  System.out.println("Multiplication =  " + ans);
  }   
 else   if (operator == 'P') 
   {
	   ans = Math.pow(first , second);
	   System.out.println("Power =  " + ans);
	   
   }
   
   else if (operator == 'S')
   {
	   ans = Math.sqrt(first);
	   System.out.println("Square Root =  " + ans);
	   
   }
	else   
   {
      System.out.println("Invalid Entry/n Error");
	  
   }
	
}
}