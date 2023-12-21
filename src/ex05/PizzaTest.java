package ex05;

import ex05.Pizza00;

class Pizza00 {
    int radius;

    Pizza00(int r){
        radius = r;
    }
    Pizza00 whoLargest(Pizza00 p1, Pizza00 p2){
        if (p1.radius > p2.radius) {
            return p1;
        } else {
            return p2;
        }
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza00 obj1 = new Pizza00(14);
        Pizza00 obj2 = new Pizza00(18);

        Pizza00 largest = obj1.whoLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼.");
    }
}
