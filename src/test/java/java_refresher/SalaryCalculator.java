package java_refresher;

/**
 *  IF statement
 *     1. All sales personnel get a $1000 a week
 *     2. IF any makes more than 10 sales a week, he/she gets an additional $250 bonus
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        //1. Initialize known values
        int salary = 1000;
        int bonusPay = 250;
        int quota = 10;

        //2. Get the number of sales made per week
        System.out.print("Enter the number of sales made this week: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();
        scanner.close();

        //3. Reward high performers with a bonus pay
        if (numberOfSales > quota) {
            salary += bonusPay; // $1,250

            //4. Display output message based on sales/salary made
            System.out.format("Well done, your weekly salary has increased to $%d", salary);
        } else {
            System.out.format("Your weekly salary is $%d", salary);
        }
    }
}
