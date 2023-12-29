package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example05 extends JFrame {
    public Example05() {
        setSize(350, 200);
        setLayout(new FlowLayout());
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10)); // GridLayout 생성자 수정

        JLabel jLabel1 = new JLabel("나의 BMI 지수는 얼마나 될까?                        ");
        JLabel jLabel2 = new JLabel("나의 체중(kg):");
        JLabel jLabel3 = new JLabel("나의 키(m):     ");

        JTextField jTextField1 = new JTextField(10);
        JTextField jTextField2 = new JTextField(10);

        JButton jButton = new JButton("BMI 확인하기");

        add(jLabel1);
        add(jLabel2);
        add(jTextField1);
        add(jLabel3);
        add(jTextField2);
        add(jButton);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example05 f = new Example05();
    }
}