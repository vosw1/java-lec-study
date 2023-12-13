package ex02;

import java.util.Scanner; //패키지명 + 클래스명

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //힙에 띄우기
        int x, y, sum;

        System.out.print("첫 번째 숫자를 입력하시오: ");
        x = sc.nextInt(); // 키보드에 입력한 값을 x에 받음

        System.out.print("두 번째 숫자를 입력하시오: ");
        y = sc.nextInt(); // 키보드에 입력한 값을 y에 받음

        sum = x + y;
        System.out.print(sum);
    }
}
