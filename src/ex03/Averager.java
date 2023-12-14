package ex03;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while(true) {
            //1. 점수 입력받기
            System.out.print("점수를 입력하시오: ");
            int grade = sc.nextInt();

            //2. 음수일때 브레이크 걸기
            if(grade < 0){
                break;
            }
            //3. 점수들의 총합내기
            total += grade;
            count++;
        }
        //4. 평균 출력하기
        System.out.println("평균은 " + total / count);
    }
}
