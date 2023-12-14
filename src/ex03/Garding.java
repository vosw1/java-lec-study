package ex03;

import java.util.Scanner;

public class Garding {
    public static void main(String[] args) {

        //1. 성적 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오: ");
        int grade = sc.nextInt();

        //2. 성적에 따른 학점 주기
        if(grade >= 90){
            System.out.println("학점 A");
        } else if (grade >= 80) {
            System.out.println("학점 B");
        } else if (grade >= 70) {
            System.out.println("학점 C");
        } else if (grade >= 60) {
            System.out.println("학점 D");
        } else{
            System.out.println("학점 F");
        }
    }
}
