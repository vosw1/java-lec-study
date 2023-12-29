package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame01 extends JFrame {
    public MyFrame01() {
        setSize(300,200);
        setTitle("My Frame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame01 f = new MyFrame01();
    }
}