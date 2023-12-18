package ex04;

class Person4{
    //상태 = 변수
    private int weight = 100;

    //값을 확인- 메서드를 통해서 간접적으로 호출
    public int getWeight(){ // 카멜 표기법
        return weight;//메서드를 호출한 곳으로 값을 리턴해줌
    }

    //행위 = 메서드
    public void exercise(){ // 리턴이 없으니 void
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        System.out.println("p4의 몸무게 : " + p4.getWeight());

        p4.exercise();
        System.out.println("p4의 몸무게 : " + p4.getWeight());

        p4.exercise();
        p4.exercise();
        p4.exercise();
        p4.exercise();
        p4.exercise();
        p4.exercise();
        p4.exercise();
        p4.exercise();
        p4.exercise();
        System.out.println("p4의 몸무게 : " + p4.getWeight());
    }
}
