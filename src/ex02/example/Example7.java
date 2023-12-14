package ex02.example;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 구입한 상품의 가격과 손님한테 받은 금액 입력하기
        System.out.print("받은 돈: ");
        int money = sc.nextInt();
        System.out.print("상품 가격: ");
        int price = sc.nextInt();

        //2. 부가세와 잔돈 출력하기
        int tax = price / 10;
        System.out.println("부가세: " + tax);
        int change = money - price;
        System.out.println("잔돈: " + change);
    }
}
