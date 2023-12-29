package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example01 extends JFrame {
    public Example01() {
        setSize(400, 150);
        setTitle("My Frame");

        JLabel label = new JLabel("자바는 재미있나요?");

        setLayout(new FlowLayout());
        JButton button1 = new JButton("Yes");
        JButton button2 = new JButton("No");

        add(label);
        add(button1);
        add(button2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example01 f = new Example01();
    }
}
