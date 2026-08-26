import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {

        final int COVERAGE = 350;

        int length, width, height;
        double totalSqFt;
        double paintNeeded;

        Scanner kb = new Scanner(System.in);

        System.out.println("What is the length of the room?");
        length = kb.nextInt();

        System.out.println("What is the width of the room?");
        width = kb.nextInt();

        System.out.println("What is height of the room?");
        height = kb.nextInt();

        totalSqFt = 2 * height * (length * width);

        paintNeeded = totalSqFt / COVERAGE;

        System.out.println("The room has length: " + length + ", width: " + width + ", and height: " + height);
        System.out.println("You will need " + paintNeeded + " gallons of paint");
    }
}
