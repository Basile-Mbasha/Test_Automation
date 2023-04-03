package java_refresher;

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args) {

        //1. Get pennies - 1 cent
        System.out.print("How many pennies do you have? ");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        //2. Get nickels - 5 cents
        System.out.print("How many nickels do you have? ");
        int nickels = scanner.nextInt();
        nickels *= 5;

        //3. Get dimes - 10 cents
        System.out.print("How many dimes do you have? ");
        int dimes = scanner.nextInt();
        dimes *= 10;

        //4. Get quarters - 25 cents
        System.out.print("How many quaters? ");
        int quaters = scanner.nextInt();
        quaters *= 25;
        scanner.close();

        //5. Check if values entered are equal to 100 cents - 1 dollar
        var dollarChecker = pennies + nickels + dimes + quaters;
        var dollar = 100;
        if (dollarChecker == dollar) {

            //6. Display output result
            System.out.format("Congrats! You won.");
        } else if (dollarChecker < dollar) {
            dollar -= dollarChecker;
            if (dollar == 1) {
                System.out.printf("You were short of %d cents.", dollar);
            } else {
                System.out.printf("You were short of %d cents.", dollar);
            }
        } else {
            dollarChecker -= dollar;
            System.out.printf("You have %d more cents.", dollarChecker);
        }
    }
}