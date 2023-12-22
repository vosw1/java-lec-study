package ex06.example00;

class Circle {
    protected int radius;

    public Circle(int r) {
        radius = r;
    }
}

class Pizza0 extends Circle {
    String toppings;
    int size;

    public Pizza0(String toppings, int size) {
        super(size);
        this.toppings = toppings;
        this.size = size;
    }

    public static void print(Pizza0 obj) {
        System.out.println("피자의 종류: " + obj.toppings + ", 피자의 크기: " + obj.size);
    }
}

public class Example01 {
    public static void main(String[] args) {
        Pizza0 obj = new Pizza0("Pepperoni", 20);
        obj.print(obj);
    }
}
