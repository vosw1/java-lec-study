package ex16;

class MyRunanle implements Runnable {
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
    }
}

public class MyRunableTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunanle());
            t.start();
    }
}
