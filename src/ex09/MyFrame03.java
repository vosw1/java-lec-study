package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame03 extends JFrame {
    public MyFrame03() {
        setSize(300,150);
        setLocation(200,300);
        setTitle("My Frame");

        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);

        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        this.add(button1);
        this.add(button2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame03 f = new MyFrame03();
    }
}
