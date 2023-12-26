package ex07.example;

//라이브러리 판매
interface EventListener {
    void action(); // 이벤트 감지후 행위는 개발자가 정함
}

//라이브러리 판매자가 생성
class MyApp {
    public void click(EventListener l) {
        l.action();
    }
}

//내가 이벤트리스너를 구현해서 만들어야함

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        // 람다 표현식 : 메서드만 넘기는 기법
        app.click(() -> System.out.println("회원가입 로직이 실행됩니다"));
    }
}
