package ex03;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //이미 만들어져있으니 재사용하면 됨
        //잘라내기 했을때 오류가 나는것 : 드래그를 잘못한 것

        while(true){ //조건식을 넣는것보다 이게 나음
            System.out.print("정수를 입력하시오: "); //반복의 시작점

            int number = sc.nextInt();
            if(number == 99){
                break;
            }

            if(number > 0){
                System.out.println("양수입니다.");
            } else if(number == 0){
                System.out.println("0입니다.");
            } else{
                System.out.println("음수입니다.");
            }
        }
    }
}