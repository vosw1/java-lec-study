package ex08.example.test01;

public class StringEx014 {
    public static void main(String[] args) {

        int count = 1;

        // 인코딩 AABBBCCCCDDDDD
        String data = "AABBBCCCCDDDDD";

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

        // 디코딩 A2B3C4D5
        System.out.println("");
        String data2 = "A2B3C4D5";

        //아웃오브 바운드 오류 용
        char addData2 = '.';
        String newData2 = data2 + addData2;
        String deCo[] = newData2.split("");

        // 2. 일단 해보기
        // []번지가 글자이면 글자 출력
        // []번지가 숫자이면 앞쪽에 있는 글자를 나온 숫자만큼 출력
        for (int k = 0; k < deCo.length - 1; k++) {

            // 배열의 몇번째 요소가 숫자인지를 확인
            // 0에서 9 사이의 숫자인 경우 : true 그 외는 false
            if (Character.isDigit(deCo[k].charAt(0))) {
                int repeatCount = Integer.parseInt(deCo[k]);
                for (int l = 0; l < repeatCount; l++) {
                    System.out.print(deCo[k - 1]);
                }
            } else {
                System.out.print(deCo[k]);
            }
        }
    }
}