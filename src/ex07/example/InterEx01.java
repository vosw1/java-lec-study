package ex07.example;

interface Remocon{ // 메서드 강제 -> 동적 바인딩
    void on(); // 앞에 public abstract 생략 가능
    void off();
}

class SamsungRemocon implements Remocon{
    @Override
    public void on() {
        System.out.println("삼성 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모콘 off");
    }
}

class LgRemocon implements Remocon{
    @Override
    public void on() {
        System.out.println("엘지 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모콘 off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : SamsungRemocon, LgRemocon
 */

class CommonRemocon{
    // 컴포지션(결합) = has 관계 : CommonRemocon이 Remocon을 가지고 있음
    // [SamsungRemocon, Remocon]
    // [LgRemocon, Remocon]

    private Remocon r; // null 값 = 인터페이스 or 추상클래스

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on(){
        r.on();
    }

    public void off(){
        r.off();
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        //Remocon samsung = new SamsungRemocon(); // [SamsungRemocon, Remocon]
        //samsung.on();

        // 생성자로 객체 전달
        // 동적 바인딩 : 내가 무엇을 넣느냐에 따라서 결정됨
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
        cr.on();
    }
}
