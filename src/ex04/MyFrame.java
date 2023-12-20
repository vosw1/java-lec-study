package ex04;

import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Hello"); // heap에 띄움

        JButton btn1 = new JButton("클릭");
        jf.add(btn1); // JButton이 component 타입을 상속했기에 가능함

        btn1.addActionListener(e -> {
            //버튼을 클릭하면 어떤 행위를 할지 작성
            System.out.println("버튼 클릭됨");
        });

        jf.setSize(300, 500);
        jf.setVisible(true);
    }
}
