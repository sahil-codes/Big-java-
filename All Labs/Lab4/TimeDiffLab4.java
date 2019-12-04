import java.util.Scanner;
public class TimeDiffLab4
{
    public static void main(String[] args)
    {
        final int MINUTES_IN_HOUR = 60;
        final int MINUTES_IN_DAY = 24 * 60;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int firstTime = in.nextInt();

        int firstTimeInMinutes = firstTime / 100 * MINUTES_IN_HOUR + firstTime % 100;
        System.out.println("firstTimeInMinutes: " + firstTimeInMinutes);

        System.out.print("Please enter the second time: ");
        int secondTime = in.nextInt();

        int secondTimeInMinutes = secondTime / 100 * MINUTES_IN_HOUR + secondTime % 100;
        System.out.println("secondTimeInMinutes: " + secondTimeInMinutes);

        int minutes = Math.abs(secondTimeInMinutes) - Math.abs(firstTimeInMinutes);
        System.out.println("Total minutes: "  + minutes);

        minutes = Math.abs((MINUTES_IN_DAY + minutes) % MINUTES_IN_DAY);
     
	    int hours = minutes / 60;
		minutes = minutes % 60;

        System.out.printf(+ hours + " hours " + minutes + " minutes ");
    }
}