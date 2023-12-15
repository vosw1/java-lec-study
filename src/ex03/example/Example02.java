package ex03.example;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 연산 기호 입력받기
        System.out.print("연산을 입력하세요: ");
        String operator = sc.next();

        // 2. 2개의 숫자 입력받기
        System.out.print("피연산자 2개를 입력하세요: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        // 3. 연산하기
        if (operator.equals("+")) {
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        } else if (operator.equals("-")) {
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        } else if (operator.equals("*")) {
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        } else if (operator.equals("/")) {
            // 0으로 나누는지 확인
            if (n2 != 0) {
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } else {
        }
    }
}
