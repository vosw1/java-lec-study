package ex06;

class Shape1 {
    public void draw() {
        System.out.println("Shape 중의 하나를 그릴 예정입니다.");
    }
}

class Circle1 extends Shape1 {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}

public class ShapeTest01 {
    public static void main(String[] args) {
        Circle1 s = new Circle1();
        s.draw();
    }
}