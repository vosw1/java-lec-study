package ex13.SetTest;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }
    }
}
