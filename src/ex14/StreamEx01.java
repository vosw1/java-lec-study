package ex14;

import java.util.*;

public class StreamEx01 {
    public static void main(String[] args) {
        // 3개를 넣을 때는 배열, 컬렉션(ArrayList), 벡터에 넣음
        // ? 때? 클래스 자료형 사용
        // 자료를 관리할 때 하나의 타입안에 담겨있는게 가장 좋음
        Map<String, Object> data = new HashMap<>();
        data.put("name", "홍길동");
        data.put("age", 20);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "장보고");
        data2.put("age", 15);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신");
        data3.put("age", 30);

        List<Map<String, Object>> arr = Arrays.asList(data, data2, data3);

        List<Map<String, Object>> newArr = arr.stream().map(d -> {
            int newAge = (Integer) d.get("age") -1;
            d.put("age", newAge);
            return d;
        }).toList();

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });
    }
}
