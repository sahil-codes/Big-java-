import java.util.Scanner;

public class Tax{
	
	public static void main(String[] args){
 		
	double stateTax , countyTax , totalTax , totalCost;
		
    Scanner scan = new Scanner (System.in);
	System.out.print("Enter the purchase amount :  ");
	double Purchase_Amount = scan.nextDouble();
	
	System.out.print("Purchase Amount : $" + Purchase_Amount + "\n");
	
	stateTax = Purchase_Amount * 0.04;
	
	countyTax = Purchase_Amount * 0.02;
	
	totalTax = stateTax + countyTax;
	
	totalCost = totalTax + Purchase_Amount;
	
	System.out.println("State Tax :  $" + stateTax);
	System.out.println("County Tax :  $" + countyTax);
	System.out.println("Total Tax :  $" + totalTax);
	System.out.println("Total Cost :  $" + totalCost);
	
	}
	
}