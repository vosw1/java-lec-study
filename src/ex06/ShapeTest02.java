
package ex06;

class Shape2 {
    protected int x, y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle2 extends Shape2 {
    private  int weidth, height;
    public  void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle2 extends Shape2 {
    private  int base, height;
    public  void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle2 extends Shape2 {
    private  int radius;
    public  void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest02 {
    public static void main(String[] args) {
        Shape2 s1, s2;

        s1 = new Shape2();
        s2 = new Rectangle2();
    }
}