package ex03.example;

public class Example03 {
    public static void main(String[] args) {
        for (int i = 1; i < 51; i++) {
            if(i % 3 == 0){
                System.out.print("짝 ");
            } else{
                System.out.print(i + " ");
            }
        }
    }
}