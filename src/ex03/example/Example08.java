package ex03.example;

public class Example08 {
    public static void main(String[] args) {

        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c < 100; c++) {
                    int traiangle = a*a + b*b;
                    if(c*c == traiangle){
                        System.out.print(a + " " + b + " " + c + " ");
                    }
                }
            }
        }
    }
}
