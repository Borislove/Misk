package Warehouse.utils;

import java.io.InputStream;

//
// TODO: 06.07.2020 !
class Scanner_sc {
    public Scanner_sc(InputStream in) {
    }

    public static void main(String[] args) {

        //-------------------------------------------------------
      /*  int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new java.util.Scanner_sc(System.in).nextInt();
        b = new java.util.Scanner_sc(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);*/
        //-------------------------------------------------------

        //это пока не работает
        //Scanner_sc key = new Scanner_sc(System.in);


        //----------------пока этим пользуюсь
        /*int ver = new java.util.Scanner_sc(System.in).nextInt();
        int a = Integer.valueOf(ver);*/

        //----------через строку----------------------------------
        while (true) {
            System.out.println("Введи текст");
            String ver = new java.util.Scanner(System.in).nextLine();
            String str = String.valueOf(ver);

            if (str.equals("Help")) {
                System.out.println("Раздел помощь");
            }
            if(str.equals("Exit")) {
                System.out.println("Вы вышли");
                break;
            }
        }
    }
}



