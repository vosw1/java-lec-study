package ex03;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int value = 0;

        while(true){
            sum = sum + value;
            System.out.print("정수를 입력하시오: ");
            value = sc.nextInt();

            if(value == -1){
                break;
            }
        }
        System.out.println("정수의 합은 " + sum + "입니다.");
    }
}
