package ex13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));

        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        // 합집합
        s1.addAll(s2);
        System.out.println("합집합의 값은:" + s1);

        // 교집합
        s1.retainAll(s2);
        System.out.println("교집합의 값은:" + s1);
    }
}