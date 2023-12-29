package ex09;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    private String[] labels = {
            "Backspace", "", "", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "x", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "="
    };

    public CalculatorFrame() {
        tField = new JTextField(35);
        panel = new JPanel();
        tField.setText("0.");
        tField.setEnabled(false);

        panel.setLayout(new GridLayout(0, 5, 3, 3));
        buttons = new JButton[25];

        int index = 0;
        for (int row = 0; row < 5; row++) {
            for (int cols = 0; cols < 5; cols++) {
                buttons[index] = new JButton(labels[index]);
                if(cols >= 3) {
                    buttons[index].setForeground(Color.red);
                } else {
                    buttons[index].setForeground(Color.blue);
                }
                    buttons[index].setBackground(Color.yellow);
                    panel.add(buttons[index]);
                    index++;
            }
            add(tField, BorderLayout.NORTH);
            add(panel, BorderLayout.CENTER);

            setVisible(true);
            pack();
            }
        }
    public static void main(String[] args) {
        CalculatorFrame f = new CalculatorFrame();
    }
}
