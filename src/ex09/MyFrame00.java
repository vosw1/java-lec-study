package ex09;

import javax.swing.*;

public class MyFrame00 extends JFrame {
    public MyFrame00() {
        setSize(300,200);
        setTitle("My Frame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame00 f = new MyFrame00();
    }
}
