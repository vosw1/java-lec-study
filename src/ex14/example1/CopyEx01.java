package ex14.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4);

        // 객체 참조 (복사가 아닌 참조)
        List<Integer> newList = new ArrayList<>(list);

        // 요소 추가
        newList.add(5);

        // 사이즈 출력
        System.out.println("List Size: " + list.size());
        System.out.println("newList Size: " + newList.size());
    }
}