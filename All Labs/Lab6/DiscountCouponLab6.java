import java.util.Scanner;

public class DiscountCouponLab6
 {
    public static void main(String[] args) 
	
	{
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter groceries price: ");
        double groceries = in.nextInt();

        double couponPrice = 0;
		
		if (groceries > 10 && groceries < 60) {
            couponPrice = groceries * 0.08;
        }
        else if (groceries > 60 && groceries < 150) {
            couponPrice = groceries * 0.1;
        }
        else if (groceries > 150 && groceries < 210) {
            couponPrice = groceries * 0.12;
        }
        else if (groceries > 210) {
            couponPrice = groceries * 0.14;
        }

        if (couponPrice > 0) {
            System.out.printf("You win a discount coupon of $ " + couponPrice + ".");
        }
        else {
            System.out.printf("No Coupon!");
        }
    }
}