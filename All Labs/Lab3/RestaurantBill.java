public class RestaurantBill{
	
	
	 public static void main (String[] args){
		

        double mealCharge , taxAmount , tipAmount , totalBill ;

        mealCharge = 5000;

        taxAmount = (mealCharge*6.75)/100;	
      
        tipAmount = (mealCharge + taxAmount)*0.2; 

        totalBill = mealCharge + taxAmount + tipAmount;


        System.out.println("Your MealCharges are :  " + mealCharge);
   
        System.out.println("Your  TaxAmount is :  "+ taxAmount);

        System.out.println("Your TipAmount is  " + tipAmount);

        System.out.println("Your TotalBill is :  " + totalBill);
		



		
	 }
	 
	 
}