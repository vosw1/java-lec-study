package ex02.example;

public class Example04 {
    public static void main(String[] args) {
        int P, Q;
        boolean p, q;

        // 헤더 출력
        System.out.println("P       Q       AND     OR      XOR");

        // Case 1
        boolean p1 = true;
        boolean q1 = true;
        System.out.println(p1 + "\t" + q1 + "\t" + (p1 && q1) + "\t" + (p1 || q1) + "\t" + (p1 ^ q1));

        // Case 2
        boolean p2 = true;
        boolean q2 = false;
        System.out.println(p2 + "\t" + q2 + "\t" + (p2 && q2) + "\t" + (p2 || q2) + "\t" + (p2 ^ q2));

        // Case 3
        boolean p3 = false;
        boolean q3 = true;
        System.out.println(p3 + "\t" + q3 + "\t" + (p3 && q3) + "\t" + (p3 || q3) + "\t" + (p3 ^ q3));

        // Case 4
        boolean p4 = false;
        boolean q4 = false;
        System.out.println(p4 + "\t" + q4 + "\t" + (p4 && q4) + "\t" + (p4 || q4) + "\t" + (p4 ^ q4));
    }
}
