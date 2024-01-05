package coffee;

public class Customer {
    //손님이 필요로 하는 것 : 커피를 만들어줄 바리스타
    private Barista barista;

    // 컴퍼지션 : 의존적일 때
    public Customer(Barista barista) {
        this.barista = barista;
    }

    // 손님의 행위 : 주문하기
    public void order(String menuName){
       //Coffee coffee = barista.makeCoffee();
        // System.out.println(coffee + "를 받았습니다");
    }
}
