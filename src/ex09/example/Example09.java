import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Example09 extends JFrame {
    private int[] labels; // 배열 초기화
    private JPanel panel;

    public Example09() {
        setSize(400, 200);
        setLayout(null);

        // 배열 크기 지정
        int num = 20;
        labels = new int[num];

        // 랜덤 위치에 배치
        Set<Point> usedLocations = new HashSet<>();

        for (int index = 0; index < num; index++) {
            // 올바른 난수 범위로 수정
            labels[index] = (int) (Math.random() * num);

            // 랜덤 위치에 JLabel 추가 (가정)
            JLabel label = new JLabel(String.valueOf(labels[index]));

            Point location;
            do {
                int x = (int) (Math.random() * 350);
                int y = (int) (Math.random() * 80);
                location = new Point(x, y);
            } while (usedLocations.contains(location));

            usedLocations.add(location);

            label.setBounds(location.x, location.y, 400, 80);
            add(label);
        }
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Example09 f = new Example09();
    }
}
