package testhello;

import java.util.Arrays;

public class TestHello4 {

    static char chStatic = ' ';

    public static void main(String[] args) throws InterruptedException {

      //  String str = "Привет";
        String str = "Привет, поздравляю всех с новым 2021 годом! Желаю успехов, счастья и т.д!";
        char[] chars = str.toCharArray();

        char[] chars1 = new char[chars.length];

       // System.out.println(Arrays.toString(chars));

        for (Character ch : chars) {
         //   System.out.println(ch);
        }


        for (int i = 0; i < chars.length; i++) {
            char ch = ' ';
           // System.out.println("i = " + chars[i]);
            ch = chars[i];
          //  System.err.println("ch = " + ch);
            chStatic = chars[i];
            chars1[i] = chars[i];
        }

       // System.out.println(chStatic);
        //System.out.println(Arrays.toString(chars1));


        //в одной ячейке, меняет значение
      /*  for (int i = 0; i <chars1.length ; i++) {
            sleeping(800);
            System.out.print(chars1[i]+"\r");
        }*/


      //пишет текст с задержкой
        for (int i = 0; i <chars1.length ; i++) {
            sleeping(200);
            System.out.print(chars1[i]);
        }


       /* sleeping(500);
        System.out.print(str + "\b" + "\b" + "\b" + "\b" + "\b" + "\r");
        sleeping(500);
        System.out.print(str + "\b" + "\b" + "\b" + "\b" + "\r");

        sleeping(500);
        System.out.print(str + "\b" + "\b" + "\b" + "\r");

        sleeping(500);
        System.out.print(str + "\b" + "\b" + "\r");

        sleeping(500);
        System.out.print(str + "\b" + "\r");

        sleeping(500);
        System.out.print(str);

        for (int i = 0; i < 10; i++) {
            sleeping(400);
            System.out.print("!");
            sleeping(400);
            System.out.print("\b");
        }*/

    }

    static void sleeping(int sleep) throws InterruptedException {  //исключение прерывания
        Thread.sleep(sleep);
    }
}


