package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨(미국F)온도를 입력하시오: ");

        //1. 화씨 온도 받기
        double f = sc.nextDouble();
        //System.out.println(f);

        //2. 화씨 -> 섭씨 온도로 변환
        double c = 5.0 / 9.0 * (f - 32);
        System.out.println(c);
    }
}