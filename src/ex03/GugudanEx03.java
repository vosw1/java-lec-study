package ex03;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.print(i + "단\t\t\t");
        }
        System.out.println(); // 줄 바꿈

        // 각 단의 곱셈 결과를 가로로 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, (i * j));
            }
            System.out.println(); // 한 행이 끝나면 줄 바꿈
        }
    }
}