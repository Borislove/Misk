package Warehouse.menu;

// jdk 13.0.1

import java.util.Scanner;

public class Menu {

    static String option_1 = "option 1";
    static String option_2 = "option 2";

    public static void main(String[] args) throws InterruptedException {

        cls();

        //System.out.println("Добро пожаловать в меню!"); // иероглифы
        System.out.println("Please, select option\n");
        System.out.println("Menu: ");

        char ch = 42;

        System.out.println(option_1 + ch);
        System.out.println(option_2);

        Scanner scanner = new Scanner(System.in);
        // scanner.nextInt();

        while (true) {
            if (scanner.nextInt() == 2) {
                System.out.println(option_1);
                System.out.println(option_2 + ch);
                setOption_2();
                Thread.sleep(1000);
                cls();
                System.out.println(option_1);
                System.out.println(option_2 + ch);
            }
            if (scanner.nextInt() == 1) {
                System.out.println(option_1 + ch);
                System.out.println(option_2);
                setOption_1();
                Thread.sleep(1000);
                cls();
                System.out.println(option_1 + ch);
                System.out.println(option_2);
            }
            //else
            //  System.out.println(option_2 + ch);

            if (scanner.nextInt() == 0)
                System.exit(0);
        }
    }

    public static void setOption_1() {
        System.out.println("Hello world_1");
    }

    public static void setOption_2() {
        System.out.println("Hello world_2");
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
