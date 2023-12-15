package ex03.example;

public class Example07 {
    public static void main(String[] args) {
        // 1. 2~100까지의 수
        for (int i = 2; i <= 100; i++) {
            boolean primeNumber = true; // 소수 여부를 판단하기 위한 변수

            // 2. 소수 : 2~i-1까지 나누어 나머지가 0인지 확인
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    primeNumber = false; // 나누어 떨어지면 소수가 아님
                }
            }

            // 소수인 경우에만 출력
            if (primeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}
