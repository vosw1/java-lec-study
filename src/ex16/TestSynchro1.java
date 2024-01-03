package ex16;

class Printer1 {
    synchronized void print(int[] arr) {
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

class MyThread21 extends Thread {
    Printer prn;
    int[] myarr = {10, 20, 30, 40, 50};

    MyThread21(Printer prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

class MyThread31 extends Thread {
    Printer prn;
    int[] myarr = {1, 2, 3, 4, 5};

    MyThread31(Printer prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

public class TestSynchro1 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        MyThread21 t1 = new MyThread21(obj);
        MyThread31 t2 = new MyThread31(obj);
        t1.start();
        t2.start();
    }
}
