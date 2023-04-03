package java_refresher;

import java.util.Scanner;

/**
 * IF-ELSE
 * All salespeople are expected to make at least 10 sales.
 * For those who do, they receive a Congratulations message!
 * For those who do not, they are informed on how many they were short.
 */
public class QuotaCalculator {
    public static void main(String[] args) {

        //1. Initialize known value(s)
        int quota = 10;

        //2. Get number of sales made per week
        System.out.print("Enter the number of sales made this week: ");
        Scanner scanner = new Scanner(System.in);
        int salesPerWeek = scanner.nextInt();
        scanner.close();

        //3. Display message if sales quota condition met
        if (salesPerWeek >= quota) {
            System.out.println("Congrats! You've met your quota for this week.");
        }else {
            quota -= salesPerWeek;
            if (quota > 1) {
                System.out.format("You were short of %d sales on your weekly quota.", quota);
            }else {
                System.out.format("You were short of %d sale on your weekly quota.", quota);
            }
        }
    }
}
