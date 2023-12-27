package ex06.example7;

public class Burger { //private니까 생성자 필요
    private String name;
    private int price;

    public Burger(String name, int price) { // 생성자 : 초기화
        this.name = name;
        this.price = price; // 가격 고정 -> 재사용 불가, 할인x
        System.out.println(name + "가 만들어졌어요");
    }

    //무조건 getter(상태확인) 만들기
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

