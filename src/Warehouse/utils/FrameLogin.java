package Warehouse.utils;

import javax.swing.*;
import java.awt.*;

public class FrameLogin extends JFrame {


    JTextField login = new JTextField("Login");
    JTextField password = new JTextField("Password");


    FrameLogin(String str) {
        super(str);

        //контейнер
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
       // c.setLayout(new FlowLayout()); //без параметров центр


        //параметры окна
        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null); //center
        setVisible(true);
        // setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



     c.add(login);
    c.add(password);
    }


    public static void main(String[] args) {
        new FrameLogin("FrameLogin");
    }
}
