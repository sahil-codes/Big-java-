public class SalesTax{
	
	public static void main(String[] args){
 		
    double amountofPurchase , stateSalesTax , countrySalesTax , totalSalesTax , totalSales; 

    amountofPurchase = 20000; 

    stateSalesTax = (amountofPurchase*4)/100;
 
    countrySalesTax = (amountofPurchase*2)/100;

    totalSalesTax = stateSalesTax + countrySalesTax;
	
	totalSales = amountofPurchase + totalSalesTax; 
	
	
	System.out.println("Your Amount of Purchase is :  " + amountofPurchase);
	
	System.out.println("Your State Sales Tax is :  " + stateSalesTax);
	
	System.out.println("Your Country Sales Tax is :  " + countrySalesTax);
	
	System.out.println("Your Total Sales Tax is :  " + totalSalesTax);
	
	System.out.println("Your Total Sales = :  " + totalSales);
	
	

    	


	
	}
	
}
// This code is contributed by Sahil Ranmbail
