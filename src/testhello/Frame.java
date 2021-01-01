package testhello;

import javax.swing.*;

public class Frame extends JFrame {

    static char chStatic = ' ';

    static String str = "Привет, поздравляю всех с новым 2021 годом! Желаю успехов, счастья и т.д!";
    static char[] chars = str.toCharArray();

    static char[] chars1 = new char[chars.length];

    static void sleeping(int sleep) throws InterruptedException {  //исключение прерывания
        Thread.sleep(sleep);
    }

    public static void test() throws InterruptedException {
        for (int i = 0; i < chars1.length; i++) {
            sleeping(200);
            System.out.print(chars1[i]);
        }
    }

    public static void main(String[] args) throws InterruptedException {


        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setResizable(false); //запрет на развертку окна
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //.setLocation(900,500);   //расположение фрейма
        f.setLocationRelativeTo(null);  //centre


        for (int i = 0; i < chars.length; i++) {
            char ch = ' ';
            ch = chars[i];
            chStatic = chars[i];
            chars1[i] = chars[i];

            for (int j = 0; j < chars.length; j++) {

            f.add(new JTextArea(String.valueOf(chars1[i])));
            }
        }


        f.setAlwaysOnTop(true);  //всегда поверх будет
        f.pack(); //для упаковки объектов в окне
    }
}



