package Warehouse.test;

public class TestTestTest {

    private static int a = 5;
    private static int b = 20;

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static void main(String[] args) {


        double d = 25.0;

        int result1 = a = getB();
        double result2 = getA() * d;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        System.out.println(getA());
        System.out.println(getB());
    }
}
