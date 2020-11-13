package Warehouse.frame;

import javax.swing.*;

public class FrameConst extends JFrame {

    public FrameConst(String str) {
        super(str);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        FrameConst fc = new FrameConst("FrameConstr");
    }
}
