package ex04;

class Cat{
    String name;

    Cat(){ // 디폴트 생성자
        //값이 없는 상태로 초기화되는 방법 해결
        //this.name = "토비";
        this("토비");
    }

    Cat(String name){ // 파라미터가 있는 생성자
        this.name = name;
    }
}

public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
    }
}
