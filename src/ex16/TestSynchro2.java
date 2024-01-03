package ex16;

class Printer2 {
    void print(int[] arr) throws Exception {
        synchronized (this) {
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
}

class MyThread22 extends Thread {
    Printer prn;
    int[] myarr = {10, 20, 30, 40, 50};

    MyThread22(Printer prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

class MyThread32 extends Thread {
    Printer prn;
    int[] myarr = {1, 2, 3, 4, 5};

    MyThread32(Printer prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

public class TestSynchro2 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        MyThread22 t1 = new MyThread22(obj);
        MyThread32 t2 = new MyThread32(obj);
        t1.start();
        t2.start();
    }
}
