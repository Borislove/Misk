package Warehouse.utils;

import java.io.*;

//простой вывод строки
public class Print {

        //Печать с переводом строки:
        public static void print(Object obj) {
            System.out.println(obj);
        }

        //Перевод строки:
        public static void print() {
            System.out.println();
        }

        //Печать без перевод а строки
        public static void printnb(Object obj) {
            System.out.print(obj);
        }

        public static void print(String str) {
            System.out.println(str);
        }

        // Новая конструкция Java SE5 printf() (из языка С):
        public static PrintStream printf(String format, Object... args) {
            return System.out.printf(format, args);
        }
    }

