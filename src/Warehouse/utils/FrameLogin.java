package Warehouse.utils;

import javax.swing.*;

public class FrameLogin extends JFrame {

    FrameLogin(String str) {
        super(str);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        FrameLogin fl = new FrameLogin("FrameLogin");
    }
}
