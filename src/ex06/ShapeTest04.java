package ex06;

class Shape4 {
    protected int x, y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle4 extends Shape4 {
    private  int weidth, height;
    public  void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle4 extends Shape4 {
    private  int base, height;
    public  void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle4 extends Shape4 {
    private  int radius;
    public  void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest04{

    public  static void print(Shape4 obj) {
        System.out.println("x=" + obj.x + " y=" + obj.y);
    }
    public static void main(String[] args) {
        Rectangle4 s1 = new Rectangle4();
        Triangle4 s2 = new Triangle4();
        Circle4 s3 = new Circle4();

        print(s1);
        print(s2);
        print(s3);
    }
}
