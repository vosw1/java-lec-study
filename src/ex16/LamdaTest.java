package ex16;

public class LamdaTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
            }
        };
        new Thread(task).start();
    }
}
