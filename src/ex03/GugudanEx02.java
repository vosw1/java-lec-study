package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 단 : " );
        int i = sc.nextInt();
        System.out.println(i + "단");

        for (int j = 1; j < 10; j++) {
            System.out.println(i + "x" + j + "=" + (i * j));
            if(j == 9){
                break;
            }
        }
    }
}