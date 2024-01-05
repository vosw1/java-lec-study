package coffee;

public class Barista {
    // 바리스타의 행위 : 커피 만들기
    // 컴퍼지션 : 의존적일 때
    public Coffee makeCoffee(){
        Coffee coffee = new Coffee();
        return new Coffee();
    }  // 필요로 하는 고객에게 가야 함
}
