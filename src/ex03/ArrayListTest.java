package ex03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("철수"); // 0번지
        list.add("영희"); // 1번지
        list.add("순신"); // 2번지
        list.add("지영"); // 3번지

        System.out.println(list.get(3));

        list.remove(3);

        System.out.println(list.get(3));
    }
}
