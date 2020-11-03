package Warehouse;

import java.util.Scanner;

public class TestN {

    private final int TEST_NUM;

    public static Scanner scanner = new Scanner(System.in);

    public TestN() {
        this.TEST_NUM = scanner.nextInt();
    }

    public static void main(String[] args) {

     //   new TestN();
        TestN testN = new TestN();
        System.out.println(testN.TEST_NUM);
    }
}
