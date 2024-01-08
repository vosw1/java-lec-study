package ex15;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream input = System.in; // 키보드로부터 입력받음 = Input
        try {
            int value = input.read();
            System.out.println("받은 값 : " + (char) value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}