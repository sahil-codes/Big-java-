import java.util.Scanner;

public class NumberOfDaysLab6
{
    public static void main(String[] args) {
        System.out.print("Enter a month: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        input.close();

        if (month == 2) {
            System.out.println("28 or 29 days in leap year!");
        }
        else if (month <= 7) {
            if (month % 2 == 1) {
                System.out.println("31 days");
            }
            else {
                System.out.println("30 days");
            }

        }
        else {
            if (month % 2 == 1) {
                System.out.println("30 days");
            }
            else {
                System.out.println("31 days");
            }
        }
    }
}