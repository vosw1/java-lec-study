package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame07 extends JFrame {
    public MyFrame07() {
        setTitle("GridLayoutTest");
        setSize(300, 150);
        setLayout(new GridLayout(2, 3));

        add(new JButton(("Button1")));
        add(new JButton(("Button2")));
        add(new JButton(("Button3")));
        add(new JButton(("B4")));
        add(new JButton(("Long Button5")));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame07 f = new MyFrame07();
    }
}
