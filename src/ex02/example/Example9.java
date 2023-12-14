package ex02.example;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 정수 입력받기
        System.out.print("정수: ");
        int n = sc.nextInt();

        //2. 2로 나누어 나머지 모으기
        int num = 127 / 2;
        int r1 = 127 % 2;
        //System.out.println(num);
        //System.out.println(r1);

        num = num /2;
        int r2 = num % 2;
        //System.out.println(num);
        //System.out.println(r2);

        num = num /2;
        int r3 = num % 2;
        //System.out.println(num);
        //System.out.println(r3);

        num = num /2;
        int r4 = num % 2;
        //System.out.println(num);
        //System.out.println(r4);

        num = num /2;
        int r5 = num % 2;
        //System.out.println(num);
        //System.out.println(r5);

        num = num /2;
        int r6 = num % 2;
        //System.out.println(num);
        //System.out.println(r6);

        System.out.println(n + ": " + num + r1+r2+r3+r4+r5+r6);


    }
}
