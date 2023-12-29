package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame04 extends JFrame {
    public MyFrame04() {
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.orange);

        JButton b1 = new JButton("button1");
        b1.setBackground(Color.yellow);
        JButton b2 = new JButton("button2");
        b2.setBackground(Color.green);

        panel1.add(b1);
        panel1.add(b2);
        add(panel1);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame04 f = new MyFrame04();
    }
}
