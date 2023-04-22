package java_refresher;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        //1. Get the employee's worked hours
        System.out.print("Enter the number of hours worked ");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        //2. Get the employee's hourly pay rate
        System.out.print("Enter the employee's hourly pay rate ");
        double payRate = scanner.nextDouble();
        scanner.close();

        //3. Multiply worked hours with the pay rate
        double grossPay = hoursWorked * payRate;

        //4. Display the gross pay calculation result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
