package ex04;

public class MrthodEx01 {

    static void m1(){
        System.out.println("m1");
    }

    static String m2(){
        System.out.println("m2");
        return "m2"; // 메서드, 종료
    }

    public static void main(String[] args) {
        m1(); // static은 같은 클래스에 있으면 클래스명을 생략 가능함
        m2(); // 실행시에 내부(10, 11번 라인)이 열림 -> 메모리에 뜸
              // 실행이 끝나면 리턴 값으로 바뀜
              // 결과값이 String result = "m2"과 동일
              // 결과값이 String result = m2()와 동일
              // 반환되는 값과 타입을 일치시켜줘야 함
    }
}
