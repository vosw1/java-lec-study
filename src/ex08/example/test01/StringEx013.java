package ex08.example.test01;

public class StringEx013 {
    public static void main(String[] args) {

        // 디코딩 AABBBCCCCDDDDD
        // 1. 다 쪼개서 배열에 집어넣기
        String data2 = "A2B3C4D5";
        String deCo[] = data2.split("");
        /*  for (int i = 0; i < deCo.length; i++) {
            System.out.print(deCo[i]);
        }*/

        //2. 일단 해보기
        //[]번지가 글자이면 글자 출력
        //[]번지가 숫자이면 앞쪽에 있는 글자를 나온 숫자만큼 출력
        //System.out.println(deCo[0]);

        for (int i = 0; i < deCo.length; i++) {
            if (i > 0 && Character.isDigit(deCo[i].charAt(0))) {
                int repeatCount = Integer.parseInt(deCo[i]);
                for (int j = 0; j < repeatCount; j++) {
                    System.out.print(deCo[i - 1]);
                }
            } else {
                System.out.print(deCo[i]);
            }
        }
    }
}