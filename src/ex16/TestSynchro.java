package ex16;

class Printer {
    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 extends Thread {
    Printer prn;
    int[] myarr = {10, 20, 30, 40, 50};

    MyThread2(Printer prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

class MyThread3 extends Thread {
    Printer prn;
    int[] myarr = {1, 2, 3, 4, 5};

    MyThread3(Printer prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

public class TestSynchro {
    public static void main(String[] args) {
        Printer obj = new Printer();
        MyThread2 t1 = new MyThread2(obj);
        MyThread3 t2 = new MyThread3(obj);
        t1.start();
        t2.start();
    }
}
