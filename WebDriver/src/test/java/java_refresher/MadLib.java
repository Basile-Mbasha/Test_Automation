package java_refresher;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        //1. Get season of the year
        System.out.print("Enter the current season of the year: ");
        Scanner scanner = new Scanner(System.in);
        var seasonOfTheYear = scanner.nextLine();

        //2. Get number of cups of coffee as a whole number
        System.out.print("Enter the number of cups of coffee: ");
        var cupsOfCoffee = scanner.nextInt();

        //3. Get the adjective
        System.out.print("Enter the adjective: ");
        var adjective = scanner.next();
        scanner.close();

        //4. Display Mad Lib sentence completion
        System.out.format("%n On a %s %s day, I drink a minimum of %d cups of coffee %n",
                adjective,
                seasonOfTheYear,
                cupsOfCoffee);
    }
}
