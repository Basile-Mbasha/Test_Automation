package java_refresher;

import java.util.Scanner;

/**
 *  NESTED IF
 *  1. Person must be making at least $30,000 a year
 *  2. Must have been working at their current job for at least 2 years
 */
public class LoanQualifier {
    public static void main(String[] args) {

        //1. Initialize known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //2. Get yearly salary
        System.out.print("How much do you make per year? ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        //3. Get years worked at that company
        System.out.print("How long have you been working at your current job? ");
        double years = scanner.nextDouble();
        scanner.close();

        //4. Evaluate if the user qualifies
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {

                //5. Display output message
                System.out.println("Congrats! You qualify for the loan.");
            }else {
                System.out.format("Sorry! You must have been working at your current job for at least %d years.", requiredYearsEmployed);
            }
        }
        else {
            System.out.format("Sorry! You must be earning at least $%d a year.", requiredSalary);
        }
    }
}