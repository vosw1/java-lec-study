package ex03.example;

public class Example05 {
    public static void main(String[] args) {

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= 6; j++) {
                if(i + j == 6){
                    System.out.print("(" + i + "," + j + ")");
                    System.out.print(" , ");
                }
            }
        }
    }
}
