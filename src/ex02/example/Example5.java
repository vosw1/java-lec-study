package ex02.example;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 시간 간격 입력받기
        System.out.print("시간간격을 입력하시오(단위: 초): ");
        int time = sc.nextInt();

       //2. 번개까지의 도달 거리 구하기 (소리는 초당 340m, 빛은 초당 300,000km)
        double distance = 340.0 * time; // 단위: m

        //3. 결과 출력
        System.out.println("번개가 발생한 곳까지의 거리: " + (int)distance + " m");
    }
}
