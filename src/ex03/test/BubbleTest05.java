package ex03.test;

public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length; //상수일 경우 이름을 대문자로 사용

        //5. 모든 회전 후
        int temp;

        for (int loop = 1; loop < N; loop++) {

            for (int i = 0; i < N-loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int j = 0; j < N; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}