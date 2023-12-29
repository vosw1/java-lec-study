package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example02 extends JFrame {
    public Example02() {
        setTitle("My Frame");
        setSize(400, 150);
        setLayout(new FlowLayout());

        JLabel jLabel = new JLabel("카운터 값");
        JTextField jTextField = new JTextField(8);
        JButton jButton = new JButton("증가");

        add(jLabel);
        add(jTextField);
        add(jButton);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Example02 f = new Example02();
    }
}
