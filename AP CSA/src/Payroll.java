import java.util.Scanner;

public class Payroll {

    public static double computePay(int hours, double hourlyPay) {
        return hours * hourlyPay;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        double grossPay = computePay(hours, payRate);

        double federalWithholding = grossPay * federalRate / 100;
        double stateWithholding = grossPay + stateRate / 100;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions");
        System.out.println("Federal Withholding (" + federalRate + "%): $" + federalWithholding);
        System.out.println("State Withholding (" + stateRate + "%): $" + stateWithholding);
        System.out.println("Total Deduction: $" + name + totalDeduction);
        System.out.println("Net Pay: $" + netPay);


    }
}
