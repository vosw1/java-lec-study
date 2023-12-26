package ex06;

abstract class Shape00 {
    int x, y;

    public void translate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void draw();
}

class Rectangle00 extends Shape00 {
    int width, height;
    public void draw() {
        System.out.println("사각형 그리키 메소드");
    }
}

class Circle00 extends Shape00 {
    int width, height;
    public void draw() {
        System.out.println("원 그리키 메소드");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Shape00 s1 = new Circle00();
        s1.draw();
    }
}
