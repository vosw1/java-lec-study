package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1; // 4Byte
        double d1 = 1.5; // 8Byte

        n1 = 2;

        //n1 = d1; // 큰 공간을 작은 공간에 넣을 수 없음
        d1 = n1; // 묵시적 형변환 : 메모리의 구조가 바뀐 것은 아님작은 공간을 큰 공간에 넣을 수 있음

        System.out.println(d1);
    }
}
