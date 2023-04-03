package java_refresher;

import java.util.Scanner;

/**
 * IF-ELSE-IF
 *  Display grade letter based on test score results
 */
public class GradeCalculator {

    public static void main(String[] args) {

        //1. Get the test score
        System.out.print("Enter your test score results: ");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();
        scanner.close();

        ///2. Determine the letter grade
        char grade = 'E';
        double testSCoreMax = 100;
        if (testScore > testSCoreMax) {

            //3. Display the letter grade on the screen
            System.out.println("Your test score results must be less or equal to " + testSCoreMax);
        } else if (testScore < 60) {
            grade = 'F';
        } else if (testScore < 70) {
            grade = 'D';
        } else if (testScore < 80) {
            grade = 'C';
        } else if (testScore < 90) {
            grade = 'B';
        }else {
            grade = 'A';
        }
        System.out.printf("Your grade is %c%n", grade);
    }
}
