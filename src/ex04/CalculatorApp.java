package ex04;

public class CalculatorApp { //App이 main을 가짐

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double result = cal.add(50, 80); // 리턴 값 : 130

        System.out.println("add : " + result);

        result = cal.minus(50, 80);
        System.out.println("minus : " + result);

        result = cal.divid(50, 80);
        System.out.println("divid : " + result);

        result = cal.multi(50, 80);
        System.out.println("multi : " + result);
    }
}
