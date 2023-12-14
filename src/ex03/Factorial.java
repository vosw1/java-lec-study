package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fac = 1;

        //1. 정수 입력받기
        System.out.print("정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2. 반복문으로 팩토리얼 만들기
        for (int i = 1; i < n; i++) {
            fac = fac * i;
        }
        System.out.printf("%d!은 %d입니다.\n", n, fac);
    }
}
