package ex03;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        //1. 사용자로부터 정수의 값을 입력받는다
        Scanner sc = new Scanner(System.in);
        System.out.print("정답을 추측하여 보시오: ");
        int guess = sc.nextInt();
        //2. 컴퓨터가 난수를 생성한다
        int computer = (int) (Math.random() * 100);
        //3 사용자의 값과 컴퓨터의 값을 비교하여 결과를 출력한다
        while(true) {
            if (guess > computer) {
                System.out.println("제시한 정수가 높습니다.");
                System.out.print("정답을 추측하여 보시오: ");
                guess = sc.nextInt();
                count++;
            } else if (guess < computer) {
                System.out.println("제시한 정수가 낮습니다.");
                System.out.print("정답을 추측하여 보시오: ");
                guess = sc.nextInt();
                count++;

            } else if(guess == computer) {
                System.out.print("축하합니다. ");
                count++;
                break;
            }
        }
        System.out.println("시도횟수=" + count);
        //4. 맞춘 횟수를 알려준다
    }
}
