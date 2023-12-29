package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example08 extends JFrame {
    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    private String[] labels = {
            "1", "2", "3",
            "4", "5", "5",
            "7", "8", "9",
            "*", "0", "#",
            "send", "", "end"
    };

    public Example08() {
        tField = new JTextField(35);
        panel = new JPanel();
        tField.setText("");
        tField.setEnabled(false);

        panel.setLayout(new GridLayout(0, 3, 0, 0));
        buttons = new JButton[15];

        int index = 0;
        for (int row = 0; row < 3; row++) {
            for (int cols = 0; cols < 5; cols++) {
                buttons[index] = new JButton(labels[index]);
                panel.add(buttons[index]);
                index++;
            }
            add(tField, BorderLayout.NORTH);
            add(panel, BorderLayout.CENTER);
        }
        JButton buttons = new JButton("clear");
        add(buttons,BorderLayout.EAST);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example08 f = new Example08();
    }
}
