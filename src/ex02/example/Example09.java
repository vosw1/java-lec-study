package ex02.example;

import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("정수: ");
        int num = sc.nextInt();

        // 음수일 경우 처리
        if (num < 0) {
            System.out.println("음수는 처리할 수 없습니다.");
            return;
        }

        // 2진수로 변환하여 출력
        String binaryRepresentation = convertToBinary(num);
        System.out.println(num + ": " + binaryRepresentation);
    }

    // 정수를 2진수로 변환하는 메서드
    private static String convertToBinary(int number) {
        // 높은 자리부터 낮은 자리까지 2진수로 변환하여 저장
        String binary = "";
        while (number > 0) {
            int remainder = number % 2; // 나머지 연산으로 현재 자리의 비트 구하기
            binary = remainder + binary; // 현재 자리의 비트를 결과에 추가
            number /= 2; // 다음 자리로 이동
        }

        // 만약 입력이 0인 경우에 대한 처리
        if (binary.isEmpty()) {
            binary = "0";
        }
        return binary;
    }
}