package Warehouse.frame;

import javax.swing.*;
import java.awt.*;

public class FrameIcon extends JFrame {


    public FrameIcon() {
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("log.png")));
        // this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("src\\log.png")));
        Toolkit kit = Toolkit.getDefaultToolkit();

    }

    public static void main(String[] args) {

        FrameIcon f = new FrameIcon();
        //JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(300, 300);
        f.setResizable(false); //запрет на развертку окна
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //.setLocation(900,500);   //расположение фрейма
        f.setLocationRelativeTo(null);  //centre

        //иконку меняем , 16/16
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image im = kit.getImage("src\\log.png");
        f.setIconImage(im);
        // f.pack(); //для упаковки объектов в окне
    }
}


