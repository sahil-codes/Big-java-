public class Joe{

  public static void main(String[] args)
  
  {
	// When Joe Purchases the Stock
	  
    double numberofShares1 , totalSharePrice1 , perSharePrice1 , commission1 , commissionAmount1 , total1 ;
	
	
	numberofShares1 = 32.87;
	
	perSharePrice1 = 1000;
	
	totalSharePrice1 = numberofShares1 * perSharePrice1;
	
	commissionAmount1 = 2;
	
	commission1 = (totalSharePrice1*commissionAmount1)/100;
	
	total1 = totalSharePrice1 + commission1;
	
	System.out.println("Joe paid  $" + totalSharePrice1 + " for the stock.");
	
	System.out.println("Joe paid his broker a commission of  $" + commission1 + " on the purchase.");
	
	System.out.println("So , Joe paid a total of  $" + total1 + "\n" );
 
  

    //When Joe Sold his Stock 

	double numberofShares2 , totalSharePrice2 , perSharePrice2 , commission2 , commissionAmount2 , total2 , subTotal ;
	
	
	numberofShares2 = 33.92;
	
	perSharePrice2 = 1000;
	
	totalSharePrice2 = numberofShares2 * perSharePrice2;
	
	commissionAmount2 = 2;
	
	commission2 = (totalSharePrice2*commissionAmount2)/100;
	
	total2 = totalSharePrice2 - commission2;
	
	subTotal = total2 - total1;
	
	System.out.println("Joe sold the stock for $" + totalSharePrice2 );
	
	System.out.println("Joe paid his broker a commission of  $" + commission2 + " on the sale.");
	
	System.out.println("So , Joe received a total of  $" + total2 + "\n");
	
	System.out.println("Joe's loss :  $" + subTotal );
	
  }
  
}
  

   	