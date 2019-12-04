import java.util.Scanner;


public class CircleSphereLab4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of the radius: ");
        double r = scan.nextDouble();
        System.out.println("Radius :  " + r);

        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("The area of the circle with that radius " + r + " is :  " + area + "\n");

        double circumference = 2 * Math.PI * r;
        System.out.printf("The circumference of the circle with that radius " + r + " is : " + circumference + "\n");

        double volume = 4 / 3 * Math.PI * Math.pow(r, 3);
        System.out.printf("The volume of the sphere with radius " + r + " is :  " + volume + "\n");

        double surfaceArea = 4 * Math.PI * Math.pow(r, 2);
        System.out.printf("The surface area of the sphere with radius " + r + " is :  " + surfaceArea + "\n");
    }
}