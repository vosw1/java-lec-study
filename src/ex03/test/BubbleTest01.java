package ex03.test;

public class BubbleTest01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length; //상수일 경우 이름을 대문자로 사용

        //1. 첫번째 도전 4바퀴 돌기
        for (int i = 0; i < N-1; i++) {
            //System.out.println("몇번돌지?");
        }
        //2. 4바퀴 도는데 1회전때 4바퀴 도는 내부 for문 만들기
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1; j++) {
                System.out.println("몇번돌지?");
            }

            System.out.println("");
        }
    }
}