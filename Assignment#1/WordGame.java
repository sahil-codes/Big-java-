import java.util.Scanner;

public class WordGame{

  public static void main(String[] args){
  
  String Name;
  int Age;
  String city;
  String collegeName;
  String Profession;
  
  
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter your name :  ");
  Name = scan.nextLine();
  
  System.out.println("Enter your Age :  ");
  Age = scan.nextInt();
  // LineBreak
    scan.nextLine();
  
  System.out.println("Enter your City :  ");
  city = scan.nextLine();
  
  System.out.println("Enter your College Name :  ");
  collegeName = scan.nextLine();
  
  System.out.println("Enter your Profession :  ");
  Profession = scan.nextLine();
  
  
  System.out.println("There was once a person named " + Name +
                                     " who lived in " + city + ".At the age of " 
									             + Age + " , " + Name + " went to college at " 
												       + collegeName + "." + Name + " graduated" +
                                                                   " and went to work as a " + Profession + ".");													   
  
  }   
  
  
  
  
}
   // This code is contributed by Sahil Ranmbail
