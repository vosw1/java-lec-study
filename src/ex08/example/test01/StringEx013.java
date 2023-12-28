package ex08.example.test01;

public class StringEx012 {
    public static void main(String[] args) {

        int count = 1;

        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte

        //아웃오브 바운드 오류 용
        char addData = '.';
        String newData = data + addData;


        // 인코딩 A2B3C4D5
        // 1. 다 쪼개서 배열에 집어넣기
        String enCo[] = newData.split("");
        for (int i = 0; i < enCo.length; i++) {
            //System.out.print(enCo[i]);
        }

        // 2. 중복값 찾으면 누적수 표시하고 누적 리셋
        for (int j = 0; j < enCo.length - 1; j++) {
            if (enCo[j].equals(enCo[j + 1])) {
                count++;
                //System.out.println(enCo[j] + count);
            } else {
                System.out.print(enCo[j] + count);
                count = 1;
            }
        }
    }
}