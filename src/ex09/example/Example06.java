package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example06 extends JFrame {
    public Example06() {
        setSize(350, 260);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel j1 = new JLabel("회원 등록하기");
        j1.setLocation(100, 10);
        j1.setFont(new Font("Dotum", Font.PLAIN, 20));

        JLabel j2 = new JLabel("이름                   ");
        JLabel j3 = new JLabel("패스워드           ");
        JLabel j4 = new JLabel("이메일 주소      ");
        JLabel j5 = new JLabel("전화번호           ");

        JTextField f1 = new JTextField(10);
        JTextField f2 = new JTextField(10);
        JTextField f3 = new JTextField(10);
        JTextField f4 = new JTextField(10);

        JButton b1 = new JButton("등록하기");
        JButton b2 = new JButton("취소");
        b1.setPreferredSize(new Dimension(100, 25));
        b2.setPreferredSize(new Dimension(100, 25));

        add(j1, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(j2, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(f1, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(j3, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(f2, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(j4, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(f3, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(j5, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(f4, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER; // 버튼을 중앙 정렬

        // 간격을 작게 조절
        gbc.insets = new Insets(2, -100, 2, 2);

        add(b1, gbc);

        gbc.gridx = 2;
        add(b2, gbc);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example06 f = new Example06();
    }
}
