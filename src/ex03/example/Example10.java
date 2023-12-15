package ex03.example;

public class Example10 {
    public static void main(String[] args) {
        //1. 1.0, 2.0, 3.0, 4.0의 초기 값을 가지는 배열 만들기
        double[] num = {1.0, 2.0, 3.0, 4.0};
        //2. 모든 배열의 요소 출력하기
        double sum = 0;
        double max = num[0]; // 초기 최대값은 배열의 첫 번째 요소로 설정
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            //3. 모든 요소의 합 출력하기
           sum = sum + num[i];
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println();
        System.out.println("합은 " + sum);
        //4. 최대값 찾기
        System.out.println("최대값은 " + max);
    }
}
