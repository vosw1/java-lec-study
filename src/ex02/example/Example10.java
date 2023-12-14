package ex02.example;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 물체의 무게 입력받기
        System.out.print("물체의 무게를 입력하시오(킬로그램): ");
        int weight = sc.nextInt();

        //2. 물체의 속도 입력받기
        System.out.print("물체의 속도를 입력하시오(미터/초): ");
        int speed = sc.nextInt();

        //3. 에너지 계산하기(0.5 * 무게 * 속도의 제곱)
        double energy = 0.5 * weight * speed * speed;
        System.out.println("물체는 " + energy + "(줄)의 에너지를 가지고 있다.");
    }
}
