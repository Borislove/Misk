package Warehouse.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickMe extends JFrame {

    JButton button = new JButton("Click me");


    int count = 0;
    JTextArea text = new JTextArea(String.valueOf(count));

    public ClickMe(String str) {

        super(str);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setSize(300, 300);
        setLocationRelativeTo(null); //center
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c.add(button);

        c.add(text);

        //обработка кнопки
        Handler handler = new Handler();
        button.addActionListener(handler);

     //   text.setText(String.valueOf(count));

    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //   if (e.getSource() == button) JOptionPane.showMessageDialog(null, "Нажали на кнопку");
            if (e.getSource() == button) count++;
            text.setText(String.valueOf(count));
            if (count == 10) {
                System.out.println("need click 2 button");
            }
            //System.out.println(count);
        }
    }
}


class MainClick {
    public static void main(String[] args) {

        new ClickMe("FrameConstr");
    }
}


