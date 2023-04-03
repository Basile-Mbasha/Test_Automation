package java_refresher;

import java.util.Scanner;

/**
 * SWITCH
 *      Grade letters with a proper message
 */
public class GradeMessage {

    public static void main(String[] args) {

        //1. Get the grade letter
        System.out.print("Enter a letter grade (in CAPITAL): ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        //2. Evaluate the grade
        String message = switch (grade) {
            case "A" -> "Ouaw! Excellent job.";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a little bit harder.";
            case "F" -> "Ugh Oh! You failed.";
            default -> "Error, an invalid letter has been entered. Try entering it in capital.";
        };

        //3. Display proper message
        System.out.println(message);
    }
}
