package ex05;

import java.sql.SQLOutput;

class President {

    static President instance = new President(); // main 실행전에 heap에 뜸

    private President(){

    }
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance; // 변수로 접근
        System.out.println(p1.hashCode());

        President p2 = President.instance; // 변수로 접근
        System.out.println(p2.hashCode());
    }
}
