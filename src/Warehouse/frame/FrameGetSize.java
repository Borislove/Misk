package Warehouse.frame;

import javax.swing.*;
import java.awt.*;

public class FrameGetSize extends JFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(0, 0);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //получаем разрешение
      //  System.out.println(screenSize);  //[width=1920,height=1200]
        frame.setSize(screenSize);

        frame.add(new Panel());
        frame.setVisible(true);
    }
}
