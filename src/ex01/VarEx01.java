package ex01;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 21억까지(4Byte) // 바이트에 안하는 이유: n1이 변수
        double d1 = 1.5; // 21억까지(8Byte)
        long big1 = 2000000000L; // 경까지(8Byte)
        boolean b1 = true; // true(참) or false(거짓)
        char c1 = '가'; // 문자 하나
        char c2 = 'a';
        String s1 = "가나다"; // 문자열

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);

    } // main의 끝 ->자바 프로그램 종료: 자바 프로그램의 생명주기
}
