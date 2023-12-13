package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1; // 4Byte
        double d1 = 1.5; // 8Byte

        n1 = 2;

        d1 = n1; // 업 캐스팅(자동)
        System.out.println(d1);

        //n1 = d1; // 큰 공간을 작은 공간에 넣을 수 없음
        n1 = (int)d1; // 다운 캐스팅 (절삭이 되어 2.0->2)
        System.out.println(n1);

    }
}
