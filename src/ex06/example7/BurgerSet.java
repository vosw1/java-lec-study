package ex06.example7;

public class BurgerSet { // has : burger와 coke
    private Burger burger;
    private Coke coke; // 필요한 객체를 상태로 가지고 있으면 됨

    public BurgerSet(Burger burger, Coke coke) { // 레퍼런스 변수
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice(){
        return burger.getPrice() + coke.getPrice(); // this.burger, this.coke
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
