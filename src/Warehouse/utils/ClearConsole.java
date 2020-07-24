package Warehouse.utils;


import java.io.IOException;
import java.util.Scanner;

//Очистка консоли, только под cmd!
public class ClearConsole {

    public static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Cmd.cmd(); //отключить когда в cmd, не сработает через java

        Scanner scanner = new Scanner(System.in);

        System.out.println("Запуск: 1");
        scanner.nextLine();

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello cmd!");
        }

        System.out.println("Для очистки введи clr");
        if (scanner.nextLine().equals("clr")) {
            clearConsole();
        }
    }
}
