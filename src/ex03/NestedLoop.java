package ex03;

public class NestedLoop {
    public static void main(String[] args) {
        //1. *이 반복되는 줄 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
