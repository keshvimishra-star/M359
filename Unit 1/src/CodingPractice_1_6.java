import java.util.Scanner;

public class CodingPractice_1_6 {
    public static void main(String[] args ){

        Scanner input = new Scanner(System.in);

        //Problem 1
        System.out.print("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        double average = (double)(num1 + num2 + num3) / 3;

        System.out.println("Numbers :" + num1 + ", " + num2 + ", " + num3);
        System.out.println("Average :" + average);


        //Problem 2
        System.out.print("Enter a positive decimal value: ");
        double decimal = input.nextDouble();

        int rounded = (int)(decimal + 0.5);

        System.out.println(decimal + " rounded to the nearest int is " + rounded);


        //Problem 3
        System.out.print("Enter the seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " second is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


        //Problem 4
        System.out.print("Enter the cents: ");
        int cents = input.nextInt();

        int quarters = cents / 25;
        cents = cents % 25;

        int dimes = cents / 10;
        cents = cents % 10;

        int dimes = cents / 5;
        cents = cents % 5;

        System.out.println("The coins for " + (quarters * 25 + dimes * 10 + nickels * 5 + pennies) + " cents will be " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + pennies + " penny(ies),");


        //Problem 5
        System.out.print("Enter the number of miles: ");
        double miles = input.nextDouble();

        System.out.print("Enter the number of minutes: ");
        double totalMinutes = input.nextDouble();

        double pace = totalMinutes / miles;

        int paceMinutes = (int) pace;
        int paceSeconds = (int) ((pace - paceMinutes) * 60);

        System.out.println("Average pace: " paceMinutes + " min " + paceSeconds + " sec / mile");

        input.close();
    }
}
