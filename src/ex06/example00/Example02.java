package ex06.example00;

class Animal {
    void walk() {
        System.out.println("걷을 수 있음");
    }
}

class Bird extends Animal {
    @Override
    void walk() {
        System.out.println("걷을 수 있음");
    }
    void fly() {
        System.out.println("날을 수 있음");
    }
    void sing() {
        System.out.println("노래 부를 수 있음");
    }
}

public class Example02 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();;
        bird.fly();
        bird.sing();
    }
}
