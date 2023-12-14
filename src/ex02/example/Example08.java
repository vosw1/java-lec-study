package ex02.example;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 구의 반지름 입력받기
        System.out.print("구의 반지름: ");
        double radius = sc.nextDouble();

        //2. 구의 부피 구하기
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("구의 부피: " + volume);
    }
}
