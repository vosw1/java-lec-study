package ex03;

class GugudanUtil{
    static void gugudan(int x){ //파라미터도 stack에서 만들어짐
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
        System.out.println();
    }
}

public class GugudanEx04 {

    public static void main(String[] args) {
        //구구단을 출력해주는 메서드
        //ex) GugudanUtil.gugudan(5);
        //GugudanUtil 클래스에 gugudan 정적 메서드를 호출하시오.
        //파라미터는 int 1개가 필요합니다.
        GugudanUtil.gugudan(10);

    }
}