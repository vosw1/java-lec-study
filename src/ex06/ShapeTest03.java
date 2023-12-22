package ex06;

class Shape3 {
    protected int x, y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle3 extends Shape3 {
    private  int weidth, height;
    public  void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle3 extends Shape3 {
    private  int base, height;
    public  void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle3 extends Shape3 {
    private  int radius;
    public  void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest03 {
    public static void main(String[] args) {
        Shape3[] arrayOfShapes;
        arrayOfShapes = new Shape3[3];

        arrayOfShapes[0] = new Rectangle3();
        arrayOfShapes[1] = new Triangle3();
        arrayOfShapes[2] = new Circle3();

        for (int i = 0; i < arrayOfShapes.length; i++) {
            arrayOfShapes[i].draw();
        }
    }
}
