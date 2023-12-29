package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example04 extends JFrame {
    public Example04() {
        setSize(320, 150);
        setTitle("JLabel Test");
        setLayout(new FlowLayout());
        setLayout(new FlowLayout(FlowLayout.LEFT, 25, 10)); // FlowLayout 생성자 수정

        JLabel label1 = new JLabel("   Red");
        JLabel label2 = new JLabel("   Yellow");
        JLabel label3 = new JLabel("  Green");
        JLabel label4 = new JLabel("   Blue");

        JPanel jPanel1 = new JPanel();
        jPanel1.setPreferredSize(new Dimension(40, 40));
        jPanel1.setBackground(Color.red);

        JPanel jPanel2 = new JPanel();
        jPanel2.setPreferredSize(new Dimension(40, 40));
        jPanel2.setBackground(Color.yellow);

        JPanel jPanel3 = new JPanel();
        jPanel3.setPreferredSize(new Dimension(40, 40));
        jPanel3.setBackground(Color.green);

        JPanel jPanel4 = new JPanel();
        jPanel4.setPreferredSize(new Dimension(40, 40));
        jPanel4.setBackground(Color.blue);

        add(label1);
        add(label2);
        add(label3);
        add(label4);

        add(jPanel1);
        add(jPanel2);
        add(jPanel3);
        add(jPanel4);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example04 f = new Example04();
    }
}
