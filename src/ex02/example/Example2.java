package ex02.example;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //1. 사용자로부터 마일값 읽어오기
        Scanner sc = new Scanner(System.in);
        System.out.print("마일을 입력하시오: ");
        double mile = sc.nextDouble();

        //2. 마일을 킬로미터로 변환하기
        double kilometer = mile * 1.609;
        System.out.println(mile + "마일은 " + kilometer + "킬로미터 입니다.");



    }
}

