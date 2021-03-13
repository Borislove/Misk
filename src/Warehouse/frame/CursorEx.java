package Warehouse.frame;

import javax.swing.*;
import java.awt.*;

public class CursorEx {

    JFrame frame;

    public CursorEx() {
        frame = new JFrame();
        //  Toolkit toolkit = Toolkit.getDefaultToolkit();
        //   Image image = toolkit.getImage("E:\\javadoc\\утка.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        frame.setCursor((Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("E:\\javadoc\\test.png").getImage(),
                new Point(0, 0), "custom cursor")));

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CursorEx();
    }
}

