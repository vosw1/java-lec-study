package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Student s) {
        return s.number - number;
    }
}

public class SortTest1 {
    public static void main(String[] args) {
        Student array[] = {
                new Student(2, "김철수"),
                new Student(3, "이철수"),
                new Student(4, "박철수"),
        };

        List<Student> list = Arrays.asList(array);
        Collections.sort(list); // 순서대로
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // 역순으로
        System.out.println(list);
    }
}
