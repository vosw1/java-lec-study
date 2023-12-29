import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Example07 extends JFrame {
    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;

    String[] labels = {
            "0", "1", "2", "3", "4",
            "5", "6", "7", "8", "9",
            "10", "11", "12", "13", "14",
            "15", "16", "17", "18", "19"
    };

    public Example07() {
        tField = new JTextField(20);
        panel = new JPanel();
        tField.setEnabled(false);
        setTitle("My Frame");

        panel.setLayout(new GridLayout(0, 5, 0, 0));
        buttons = new JButton[20];

        int index = 0;

        // Use a Set to keep track of used colors
        Set<Color> usedColors = new HashSet<>();

        for (int row = 0; row < 5; row++) {
            for (int cols = 0; cols < 5; cols++) {
                if (index < labels.length) {
                    buttons[index] = new JButton(labels[index]);

                    // Generate a unique color
                    Color color;
                    do {
                        int R = (int) (Math.random() * 256);
                        int G = (int) (Math.random() * 256);
                        int B = (int) (Math.random() * 256);
                        color = new Color(R, G, B);
                    } while (usedColors.contains(color));

                    usedColors.add(color);

                    buttons[index].setForeground(Color.BLACK);
                    buttons[index].setBackground(color);
                    panel.add(buttons[index]);
                    index++;
                }
            }
        }

        setLayout(new BorderLayout());
        add(tField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        tField.setBorder(BorderFactory.createEmptyBorder());
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example07 f = new Example07();
    }
}
