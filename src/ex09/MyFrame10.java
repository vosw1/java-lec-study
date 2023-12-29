package ex09;

import javax.swing.*;

public class MyFrame10 extends JFrame {
    public MyFrame10() {
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");

        panelA.add(label1);

        JButton buttton1 = new JButton("콤보피자");
        JButton buttton2 = new JButton("포테이토피자");
        JButton buttton3 = new JButton("불고기피자");
        panelB.add(buttton1);
        panelB.add(buttton2);
        panelB.add(buttton3);

        JLabel label2 = new JLabel("개수");
        JTextField field1 = new JTextField(10);
        panelB.add(label2);
        panelB.add(field1);

        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame10 f = new MyFrame10();
    }
}
