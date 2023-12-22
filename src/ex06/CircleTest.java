package ex06;

import java.sql.SQLOutput;

class Shape { // 부모
    int x, y; // int 값을 안넣으면 초기화 값 : 0

    public Shape(){
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape { // 자식
    int radius; // 반지름

    public Circle(int radius) { // 생성자 - stack에 있는 지역변수 아직 heap은 0
        System.out.println("Circle 생성됨");
        this.radius = radius;
        super.x = 0;// 부모의 변수에 접근
        super.y = 0;
    }

    double getArea(){
        return 3.14 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
    }
}
