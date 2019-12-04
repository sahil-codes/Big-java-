import java.util.Scanner;

public class LiquidTempLab4 {

     public static final double beta = 3969;
     public static final double TZERO = 85;
     public static final double KELVIN = 273;
     public static final double RZERO = 1075;
  
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
      
        System.out.println("Please enter resistence:  ");
		
		double Resistance = in.nextDouble();
		
		double Temp;
        
        Temp = (( beta * TZERO) / ((TZERO *(Math.log(Resistance/RZERO)))+ beta))- KELVIN;
       
        System.out.println("The Temperature is:  " + Temp + "°C" );
		
    }
    
}