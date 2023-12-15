package ex03.example;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int[] score = new int[4];

        // 1. 성적을 입력받아 배열에 넣기
        for (int i = 0; i < score.length; i++) {
            System.out.print("성적을 입력하시오: ");
            score[i] = sc.nextInt();
            sum = sum + score[i];
            count++;

            if (score[i] == -1){
                break;
            }
        }

        // 3. 합계 및 평균 계산
        System.out.print("합계: ");
        System.out.println(sum+1);
        System.out.print("평균: ");
        System.out.println((sum+1) / (count-1));
    }
}
