package ex03.test;

public class BubbleTest04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length; //상수일 경우 이름을 대문자로 사용

        //4. 1회전 연습하기
        int temp;
        for (int i = 0; i < N-1; i++) {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}