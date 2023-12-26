package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrameEx01 {
    static int num = 1; // 지역변수 : 참조 못함

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 500); // 창크기

        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");
        JLabel la1 = new JLabel(num+"");

        jf.add("North", btn1);
        jf.add("South", btn2);
        jf.add("Center", la1);

        btn1.addActionListener(e -> {
            num ++;
            la1.setText(num + "");
        });

        btn2.addActionListener(e -> {
            num --;
            if(num < 0) {
                num = 0;
            }
            la1.setText(num + "");
        });

        jf.setVisible(true); // 창 출력
    }
}