package coffee;

public class Customer {

    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    } // 컴퍼지션 : 의존적일 때

    public void order(String menuName){
       Coffee coffee = barista.makeCoffee();
        System.out.println(coffee.name + "를 받았습니다");
    }
}
