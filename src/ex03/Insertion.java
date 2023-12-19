package ex03;


public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 8, 10};

        int target;
        int temp;
        int N = arr.length;

        // 1회전
        for (int i = 0; i < N - 1; i++) {

            for (int j = 1; j < N; j++) {
                target = arr[j]; // 8

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int v : arr) { // 전체만 출력 가능
            System.out.print(v + " ");
        }
    }
}
