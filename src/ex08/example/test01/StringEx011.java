package ex08.example.test01;

public class StringEx011 {
    public static void main(String[] args) {

        int count = 1;

        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte

        // 인코딩 A2B3C4D5
        // 1. 다 쪼개서 배열에 집어넣기
        String darr[] = data.split("");
        for (int i = 0; i < 14; i++) {
            //System.out.print(darr[i]);
        }

        // 2. 일단 해보기
        if (darr[0].equals(darr[1])) {
            count++;
            System.out.println(darr[0] + count);
        } else {
            System.out.println(darr[0] + count);
            count = 1;
        }
    }
}