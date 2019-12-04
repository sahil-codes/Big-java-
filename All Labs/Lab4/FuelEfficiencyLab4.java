import java.util.Scanner;


public class FuelEfficiencyLab4


{

    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number of gallons of gas in the tank :");
        double gasInTank = in.nextDouble(); 

        System.out.printf("Enter fuel efficiecy in mile per gallon :");
        double milesPerGallon = in.nextDouble(); 

        System.out.printf("Enter price of fuel per gallon $:");
        double dieselPrice = in.nextDouble(); 

        
        double gallonsPerMiles = 100 / milesPerGallon;
        double costPerMiles = gallonsPerMiles * dieselPrice / 100;
        System.out.println("Cost per 100 miles $:  " + costPerMiles );

        
        double distance = milesPerGallon * gasInTank;
        System.out.println("How far the car can go with the gas in the tank :  " + distance + " miles");
  

  }


}