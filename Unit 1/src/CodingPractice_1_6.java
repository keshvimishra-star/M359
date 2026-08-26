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
    }
}
