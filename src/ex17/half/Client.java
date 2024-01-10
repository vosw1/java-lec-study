package ex17.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 20000); // 소켓 생성

            // 버퍼 만들기(send)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("1"); // 영화 요청

            // 버퍼 만들기(receive)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String responseMsg = br.readLine();
            System.out.println("서버로 부터 받은 메세지 : " + responseMsg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}