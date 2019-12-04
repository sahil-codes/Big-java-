
import java.math.*;

public class MathClassLab4  {


static int firstDigit(int n)
{
	
int digits = (int)(Math.log10(n));


n = (int)(n / (int)(Math.pow(10, digits)));


return n;
}


static int lastDigit(int n)
{

return (n % 10);
}


public static void main(String args[])
{
int n = 23456;
System.out.println(firstDigit(n) +
" " + lastDigit(n));
}
}