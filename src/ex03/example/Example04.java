package ex03.example;

public class Example04 {
    public static void main(String[] args) {

        int count = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 1; i <= 100; i++) {
            //1. 3의 배수들 구하기
            if(i % 3 == 0){
                int three = i;
                sum3 = sum3 + i;
                //System.out.println("3의 배수:" + i);
            // 2. 4의 배수들 구하기
            } else if(i % 4 == 0){
                int four = i;
                sum4 = sum4 + i;
                //System.out.println("4의 배수:" + i);
            } else{
            }
        }
        System.out.println("3의 배수들의 합=" + sum3);
        System.out.println("4의 배수들의 합=" + sum4);
        System.out.println("3 또는 4의 배수의 합=" + (sum3 + sum4));
    }
}
