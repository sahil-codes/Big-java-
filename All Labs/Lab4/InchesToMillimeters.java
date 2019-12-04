public class InchesToMillimeters
{
    public static void main(String[] args)
 
   {    
        double length = 8.5;
		
		double width = 11;
		
        double letterSize = length*width;
		
		double millimetersPerInch = 25.4;
		
		double letterSizeinInches = letterSize*millimetersPerInch;
		
		double perimeter = 2*(length+width);
		
	    double diagonal = Math.sqrt(length*length+width*width);
		
		System.out.println("The Letter Size is :  " + letterSize + "inches");
		
		System.out.println("The Letter Size in Millimeters is :  " + millimetersPerInch + "mm");
		
		System.out.println("Perimeter of a Rectangle is :  " + perimeter);
		
		System.out.println("Diagonal is :  " + diagonal);
		
   
        
    }
}
