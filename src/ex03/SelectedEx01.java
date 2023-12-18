package ex03;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        int rep = 0; // 0
        int min = rep;

        for (int j = 0; j < N-1; j++) {
            rep = j;
            min = rep;
            for (int i = rep+1; i < N; i++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }

                if (rep != min) {
                    int temp = arr[rep];
                    arr[rep] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for (int v : arr) { // 전체만 출력 가능
            System.out.print(v + " ");
        }
    }
}