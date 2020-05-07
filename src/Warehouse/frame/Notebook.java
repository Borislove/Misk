package Warehouse.frame;

import javax.swing.*;
import java.awt.*;

public class Notebook extends JFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(500, 300);
        f.setResizable(false); //запрет на развертку окна
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //.setLocation(900,500);   //расположение фрейма
        f.setLocationRelativeTo(null);  //centre

        TextArea f1 = new TextArea();
        f.add(f1);

        f.setVisible(true);
        // f.pack(); //для упаковки объектов в окне
    }
}


