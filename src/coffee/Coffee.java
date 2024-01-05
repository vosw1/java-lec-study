package coffee;

import java.util.HashMap;
import java.util.Map;

public class Coffee {

    // 커피에 대한 정보와 동작을 책임
    private Map<String, Integer> coffee;

    public Coffee() {
        this.coffee = new HashMap<>();

        // 커피 종류와 가격 설정
        // 아메리카노, 카푸치노, 마끼아또, 에스프레소
        coffee.put("아메리카노", 3000);
        coffee.put("카푸치노", 3000);
        coffee.put("마끼아또", 3000);
        coffee.put("에스프레소", 3000);
    }

    // 맵 내용 확인하는 메소드
    public void printCoffeeMenu() {
        System.out.println("커피 메뉴와 가격:");
        for (Map.Entry<String, Integer> entry : coffee.entrySet()) {
            String coffeeName = entry.getKey();
            int price = entry.getValue();
            System.out.println(coffeeName + ": " + price + "원");
        }
    }

    public Map<String, Integer> getCoffee() {
        return coffee;
    }
}
