package Warehouse.frame;

import javax.swing.*;

public class FrameConst extends JFrame {

    public FrameConst(String str) {
        super(str);
        setSize(300, 300);
        setLocationRelativeTo(null); //center
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setDefaultCloseOperation(FrameConst.EXIT_ON_CLOSE);
        //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //можно так
    }

}

class Main {
    public static void main(String[] args) {

        new FrameConst("FrameConstr");

        //  FrameConst fc = new FrameConst("test");
        //    fc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
