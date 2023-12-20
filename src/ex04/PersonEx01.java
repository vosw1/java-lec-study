package ex04;

// 설계도
class People{
    String name; // scope가 heap
    int power;
    int hp;

    // 생성자
    public People(String name, int power) { // scope가 stack
        // 값을 전달받아서 객체의 상태값이 변화
        this.name = name; // 자기 heap 영역을 의미
        this.power = power;
        this.hp = 100;
    }

    // 행위
    public void upgradePower(){
        this.power++;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PersonEx01 {
    public static void main(String[] args) {
        People p1 = new People("티모", 10);
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);

    }
}
