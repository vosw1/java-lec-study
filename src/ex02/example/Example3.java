package ex02.example;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. x값 입력받기
        System.out.print("x: ");
        int x = sc.nextInt();

        //2. y값 입력받기
        System.out.print("y: ");
        int y = sc.nextInt();

        //3. 두 수의 합 구하기
        System.out.println("두 수의 합: " + (x + y));

        //4. 두 수의 차 구하기
        System.out.println("두 수의 차: " + (x - y));

        //5. 두 수의 곱 구하기
        System.out.println("두 수의 곱: " + (x * y));

        //6. 두 수의 평균 구하기
        System.out.println("두 수의 평균: " + (double)(x + y) / 2);

        //7. 큰 수 구하기
        int max = (x>y)? x:y;
        System.out.println("큰 수: " + max);

        //8. 작은 수 구하기
        int min = (x<y)? x:y;
        System.out.println("작은 수: " + min);
    }
}
