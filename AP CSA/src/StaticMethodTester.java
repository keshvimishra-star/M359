public class StaticMethodTester {
    public static void main(String[] args) {
        System.out.println(CalcUtils.areaOfCircle(5));
        System.out.println(CalcUtils.hypotenuse(3, 4));
        System.out.println(CalcUtils.absDiff(10, 3));
        System.out.println(CalcUtils.absDiff(2.5, 10.5));
        System.out.println(RandomUtils.rollDie());
        System.out.println(RandomUtils.randint(-3, 3));

    }

    public class CalcUtils {
        // B-1
        public static double areaOfCircle(double r) {
            return Math.PI * Math.pow(r, 2);
        }

        // B-2
        public static double hypotenuse(double a, double b) {
            return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        }

        // B-3a
        public static int absDiff(int x, int y) {
            return Math.abs(x-y);
        }

        // B-3b
        public static double absDiff(double x, double y) {
            return Math.abs(x-y);
        }
    }

    public class RandomUtils {
        // C-1
        public static int rollDie() {
            return (int)(Math.random() * 6) + 1;
        }

        // C-2
        public static int randint(int first, int last) {
            return (int)(Math.random() * (last - first + 1)) + first;
        }
    }
}
