package ex04;

public class ScopeEx01 {
    int n1 = 1;
    static int n2 =2;

    static void m1(){
        int n1 = 10;
        System.out.println("m1 : " + n1); // n1 = 10
    }

    void m2(){
        System.out.println("m2 : " + n1); // n1 = 1
    }

//main 시작전에 static에 n2 변수와 n1 메서드 이름만 로드되어 있음
    public static void main(String[] args) {
        System.out.println("1");
        m1();
        System.out.println("2");
    }
}
