package Warehouse.calc;

public class Calc2 {

    private static int a, b, c;
    private static boolean isOkNumb = true;

    public Calc2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public static boolean isIsOkNumb() {

        return isOkNumb = a > 0 && b > 0 && c > 0;
    }

    public static void main(String[] args) {

    }
}
