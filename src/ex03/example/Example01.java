package ex03.example;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("ONE");
        } else if (num == 2) {
            System.out.println("TWO");
        }else if (num == 3) {
            System.out.println("THREE");
        } else if (num == 4) {
            System.out.println("FOUR");
        } else if (num == 5) {
            System.out.println("FIVE");
        } else if (num == 6) {
            System.out.println("SIX");
        } else if (num == 7) {
            System.out.println("SEVEN");
        } else if (num == 8) {
            System.out.println("EIGHT");
        } else if (num == 9) {
            System.out.println("NINE");
        } else{
            System.out.println("OTHER");
        }
    }
}



