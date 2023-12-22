package ex06;

class Shape5 {
    protected int x, y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle5 extends Shape5 {
    private  int weidth, height;
    public  void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle5 extends Shape5 {
    private  int base, height;
    public  void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle5 extends Shape5 {
    private  int radius;
    public  void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest05{

    public  static void print(Shape5 s) {
        if(s instanceof Rectangle5) {
            System.out.println("실제 타입은 Rectangle");
        }
        if(s instanceof Triangle5) {
            System.out.println("실제 타입은 Triangle");
        }
        if(s instanceof Circle5) {
            System.out.println("실제 타입은 Circle");
        }
    }

    public static void main(String[] args) {
        Rectangle5 s1 = new Rectangle5();
        Triangle5 s2 = new Triangle5();
        Circle5 s3 = new Circle5();

        print(s1);
        print(s2);
        print(s3);
    }
}
