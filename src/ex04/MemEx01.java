package ex04;

/**
 * JVM이 시작할때
 * 1. static (클래스 이름으로) 찾음 -> age, main
 * 2. main 찾아서 실행
 */
class Person1{
    static int age = 20;
    static char gender = '여';
    // 원시 자료형(primitive data type)
    // 커스텀 자료형(내가 만든 자료형)
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}
