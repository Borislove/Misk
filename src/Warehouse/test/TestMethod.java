package Warehouse.test;

import java.util.Scanner;

//без обработки
public class TestMethod {

    private static final int x;
    private final static Scanner SCANNER = new Scanner(System.in);

    static {
        x = SCANNER.nextInt();
    }

    public static int test() {
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        test();
    }
}
