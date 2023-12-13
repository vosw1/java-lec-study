package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        double f_temp, c_temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("======================");

        double x = sc.nextInt();

        if(x == 1){
            System.out.print("화씨온도를 입력하시오: ");

            f_temp = sc.nextInt();
            c_temp = (5.0 / 9.0) * (f_temp - 32);

            System.out.print("섭씨온도는 " + c_temp);
        } else if(x == 2){
            System.out.print("섭씨온도를 입력하시오: ");

            c_temp = sc.nextInt();
            f_temp = ((9.0 / 5.0) * c_temp) + 32;

            System.out.print("화씨온도는 " + f_temp);
        }

    }
}