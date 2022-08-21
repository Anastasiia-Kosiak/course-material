public class Course {
    public static void main(String[] args) {
    // тіло функції
        System.out.println("Hello, Java");
        int res = sumNumber(0, 7);
        double dRes = sumDoubleNumber(7.6, 0.34);
//        System.out.println(sumDoubleNumber(5.0, 11.3));
//        sumAndPrintNumbers(4, 10);
        double avg = ClassA.doubleAverage(4.0, 2.3);
        ClassA.printNumber(30);
        System.out.println(avg);
//        System.out.println(dRes);
    }

    // modiers <return type> <name>(params) {}
    public static int sumNumber(int a, int b) {
        int result = a + b;
        // return - вертати
        return result;
    }

    public static double sumDoubleNumber(double a, double b) {
        double result = a + b;
        return result;
    }

    public static void sumAndPrintNumbers(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }
}
