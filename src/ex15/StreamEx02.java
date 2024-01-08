package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // 키보드에 연결된 객체
        char[] ch = new char[4]; // 보조 스트림으로 데이터 읽기 => 배열

        try {
            ir.read(ch); // 보조 스트림을 먼저 읽음

            for (char c : ch) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
