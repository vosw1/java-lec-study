package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6]; // 6칸 배열
        Random r = new Random();

        int num;


        num = r.nextInt(45) + 1; // 1 ~ 45까지
        arr[0] = num;

        num = r.nextInt(45) + 1; // 1 ~ 45까지
        arr[1] = num;

        num = r.nextInt(45) + 1; // 1 ~ 45까지
        arr[2] = num;

        num = r.nextInt(45) + 1; // 1 ~ 45까지
        arr[3] = num;

        num = r.nextInt(45) + 1; // 1 ~ 45까지
        arr[4] = num;

        num = r.nextInt(45) + 1; // 1 ~ 45까지
        arr[5] = num;

        System.out.println(Arrays.toString(arr));
    }
}
