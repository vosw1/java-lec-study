package ex06;

class Animal0 {
    public static void A() {
        System.out.println("static method in Aninal0");
    }
}
public class Dog0 extends Animal0 {
    public static void A() {
        System.out.println("static method in Dog0");
    }

    public static void main(String[] args) {
        Dog0 dog = new Dog0();
        Animal0 a = dog;
        a.A(); // 부모의 메소드 호출
        dog.A(); // 자식의 메소드 호출
    }
}
