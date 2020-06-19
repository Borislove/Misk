package Warehouse.frame;

import javax.swing.*;

// TODO: 22.12.2019  ШАБЛОН ФРЕЙМА
//иногда бывает так, что то теряется...

public class Frame extends JFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setResizable(false); //запрет на развертку окна
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //.setLocation(900,500);   //расположение фрейма
        f.setLocationRelativeTo(null);  //centre

        f.setAlwaysOnTop(true);  //всегда поверх будет
        // f.pack(); //для упаковки объектов в окне
    }
}
