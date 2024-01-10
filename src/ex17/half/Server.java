package ex17.half;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000); // 리스너 소켓 생성
            Socket socket = serverSocket.accept(); // 연결후 랜덤포트 소켓 생성
            //소켓 연결 완료됨

            // 버퍼 만들기(recwived)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메세지 : " + requestMsg);

            // 프로토콜 적용하기
            // 버퍼 만들기(send) -> 동기적 : 순서대로 실행
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true); // 내부가 버퍼드 라이터가 구현되어 있음
            if(requestMsg.equals("1")) {
                pw.println("영화"); // 내부에 '\'가 내제되어 있음 - 응답
            } else if(requestMsg.equals("2")) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}