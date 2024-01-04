package ex13.SetTest;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

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
