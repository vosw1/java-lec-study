package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        String[] sample = {"i", "walk", "the", "line"};
        List<String> list = Arrays.asList(sample);
        Collections.sort(list);
        System.out.println(list);
    }
}
