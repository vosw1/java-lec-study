package ex03;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int j = 1; j < 10; j++) {
            for (int i = 2; i <= 9; i++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}