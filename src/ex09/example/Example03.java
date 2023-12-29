package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example03 extends JFrame {
    public Example03() {
        setSize(350, 150);
        setTitle("My Frame");
        setLayout(new FlowLayout());

        JLabel jLabel = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
        JButton btn1 = new JButton("1일");
        JButton btn2 = new JButton("2일");
        JButton btn3 = new JButton("3일");
        JButton btn4 = new JButton("4일");
        JButton btn5 = new JButton("5일");

        add(jLabel);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example03 f = new Example03();
    }
}
