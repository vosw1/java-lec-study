package ex02.example;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {

        //1. 오렌지의 개수 입력 안내하기
        Scanner sc = new Scanner(System.in);
        System.out.print("오렌지의 개수를 입력하시오.: ");

        //2. 오렌지의 개수 입력받기
        int orange = sc.nextInt();
        //System.out.print(orange);

        //3. 10개씩 담을 수 있는 박스 만들기
        int box = orange / 10;
        System.out.print(box + "박스가 필요하고 ");

        //4. 박스에 담고 남는 오렌지 개수 확인하기
        int result = orange % 10;
        System.out.print(result + "개가 남습니다.");

    }
}
