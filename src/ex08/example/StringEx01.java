package ex08.example;

public class StringEx01 {
    public static String encoding(String data) {
        int count = 1;

        //아웃오브 바운드 오류 용
        char addData = '.';
        String newData = data + addData;

        // 1. 다 쪼개서 배열에 집어넣기
        String enCo[] = newData.split("");

        // 2. 중복값 찾으면 누적수 표시하고 누적 리셋
        for (int j = 0; j < enCo.length - 1; j++) {
            if (enCo[j].equals(enCo[j + 1])) {
                count++;
            } else {
                if (count > 1) {
                    System.out.print(enCo[j] + count);
                } else {
                    System.out.print(enCo[j]);
                }
                count = 1;
            }
        }
        return "";
    }

    public static String decoding(String data2) {
        char addData2 = '.';
        String newData2 = data2 + addData2;
        String deCo[] = newData2.split("");

        for (int k = 0; k < deCo.length - 1; k++) {
            if (Character.isDigit(deCo[k].charAt(0))) {
                int repeatCount = Integer.parseInt(deCo[k]);
                for (int l = 0; l < repeatCount; l++) {
                    System.out.print(deCo[k - 1]);
                }
            } else {
                System.out.print(deCo[k]);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        // 인코딩 AABBBCCCCDDDDD
        encoding("AABBBCCCCDDDDD");

        System.out.println("");

        // 디코딩 A2B3C4D5
        decoding("A2B3C4D5");
    }
}