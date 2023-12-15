package ex03.example;

public class Example15 {
    public static void main(String[] args) {
        //1. 3*5 배열 만들기
        int[][] num = new int[3][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 2);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
