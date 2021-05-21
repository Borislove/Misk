package Warehouse.utils;

import java.util.Scanner;

//чтение одного символа , reading one character
public class ROC {


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        char ch;
        ch = key.findWithinHorizon(".", 0).charAt(0);
        System.out.println(ch);
        key.close();
    }
}
