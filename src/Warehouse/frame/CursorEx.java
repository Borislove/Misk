package Warehouse.frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CursorEx {

    JFrame frame;

    //BufferedImage bufferedImage = new BufferedImage(200,200, BufferedImage.TYPE_INT_RGB); //квадратик
    BufferedImage image = ImageIO.read(new File("e:\\javadoc\\cursor_5.png"));


    public CursorEx() throws IOException {
        frame = new JFrame();
        //  Toolkit toolkit = Toolkit.getDefaultToolkit();
        //   Image image = toolkit.getImage("E:\\javadoc\\утка.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        /*frame.setCursor((Toolkit.getDefaultToolkit().createCustomCursor(
                //   new ImageIcon("E:\\javadoc\\test.png").getImage(),
                //            new ImageIcon("E:\\javadoc\\finger.jpg").getImage(),
                new ImageIcon(image).getImage(),
                new Point(0, 0), "custom cursor")));*/

        frame.setCursor((Toolkit.getDefaultToolkit().createCustomCursor(
                //   new ImageIcon("E:\\javadoc\\test.png").getImage(),
                //            new ImageIcon("E:\\javadoc\\finger.jpg").getImage(),
                image,
                new Point(0, 0), "custom cursor")));

        frame.setVisible(true);

    }

    public static void main(String[] args) throws IOException {
        new CursorEx();
    }
}

