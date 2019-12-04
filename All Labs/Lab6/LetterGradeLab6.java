import java.util.Scanner;

public class LetterGradeLab6
 {
	
    public static void main(String[] args) 
	
	{
		
        final double gradeA = 4.0;
        final double gradeB = 3.0;
        final double gradeC = 2.0;
        final double gradeD = 1.0;
        final double gradeF = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value grade: ");
        String grade = in.next();

        double addition = 0;
        if (grade.charAt(1) == '+') {
            addition += 0.3;
        }
        else if (grade.charAt(1) == '-') {
            addition -= 0.3;
        }

        double result = 0;
        if (grade.charAt(0) == 'A') {
            if (addition < 0) {
                result += gradeA + addition;
            }
            else if (addition > 0) {
                result += gradeA;
            }
        }
        else if (grade.charAt(0) == 'B') {
            result += gradeB + addition;
        }
        else if (grade.charAt(0) == 'C') {
            result += gradeC + addition;
        }
        else if (grade.charAt(0) == 'D') {
            result += gradeD + addition;
        }
        else if (grade.charAt(0) == 'F') {
            if (addition > 0) {
                result += gradeF + addition;
            }
            else if (addition < 0) {
                result += gradeF;
            }
        }

        System.out.printf("The numeric value is " + result);

       
    }
}