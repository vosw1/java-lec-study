package ex02.test;

public class FtoCTest {
    public static void main(String[] args) {
        //5/9 *(100.0 - 32) 검증하기
        System.out.println(100.0-32);//결과값 : 68.0

        //5/9 * 68.0
        System.out.println(5/9);//결과값 : 0
        System.out.println(5/9.0);//결과값 : 0.5555555555555556
        System.out.println(5.0/9.0);//결과값 : 0.5555555555555556

        //0.5 * 68.0
        System.out.println(0.5 * 68.0);//결과값 : 34.0
    }
}
