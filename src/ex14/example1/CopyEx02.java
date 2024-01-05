package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        // map : 가공해서 복사
        List<Integer> newList = list.stream().map((i) -> i*100).toList();

        for (Integer i : newList){ // 인티져 i를 뉴리스트 길이만큼 돌면서 하는 것
            System.out.println(i);
        }

        //for each
        newList.stream().forEach(i -> System.out.println(i));
    }
}
