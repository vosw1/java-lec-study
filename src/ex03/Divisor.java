package ex03;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 양의 정수 입력받기
        System.out.print("양의 정수를 입력하시오: ");
        int n = sc.nextInt();

        //2. 약수 안내하기
        System.out.println(n + "의 약수는 다음과 같습니다.");
        //3.반복문으로 약수 만들기
        for (int i = 1; i <= n; i++) {
            //약수 정의하기
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
