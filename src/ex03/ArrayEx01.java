package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 12Byte 공간을 찾아줄것, 시작번지만 알려줌
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);

        }
    }
}
