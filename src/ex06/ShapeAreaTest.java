package ex06;

class Shape6 {
    public double getArea() {
        return 0;
    }
    public Shape6() {
        super();
    }
}

class Rectangle6 extends Shape6 {
    private double width, height;
    public Rectangle6(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public  double getArea() {
        return width * height;
    }
}

class Triangle6 extends Shape6 {
    private double base, height;
    public double getArea() {
        return 0.5 * base * height;
    }
    public Triangle6(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }
}

public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape6 obj1 = new Rectangle6(10.0, 20.0);
        Shape6 obj2 = new Triangle6(10.0, 20.0);

        System.out.println("Rectangle: " + obj1.getArea());
        System.out.println("Triangle: " + obj2.getArea());
    }
}
