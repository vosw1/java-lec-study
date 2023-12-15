package ex03;

public class BubbleEx01 {
    static void bubble(int[] arr){ //메서드
        final int N = arr.length; //상수일 경우 이름을 대문자로 사용

        int temp;

        for (int k = 1; k < N; k++) {

            for (int i = 0; i < N-k; i++) {
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

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        BubbleEx01.bubble(arr); //같은 클래스 안에 있을 경우 생략 가능
        System.out.println();

        int[] arr2 = {5, 8, 2, 4, 3, 10, 500, 7, 6};
        BubbleEx01.bubble(arr2);
    }
}
