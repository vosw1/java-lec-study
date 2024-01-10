package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 10000); // 소켓 생성
            //System.out.println("클라이언트 : 소켓 생성 완료");

            Thread sendThread = new Thread(() -> {
                //System.out.println("클라이언트 : 보내기 스레드 생성 완료");
                try {
                    // 버퍼 만들기(send)
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    //System.out.println("클라이언트 : 쓰기 버퍼 생성 완료");
                    System.out.println("클라이언트 : 통신 연결 완료");
                    while (true) {
                        Scanner sc = new Scanner(System.in);
                        String sendMsg = sc.nextLine();
                        pw.println(sendMsg);
                        //System.out.println("클라이언트 : 메세지 키보드로 받아서 보내기 완료");
                        Thread.sleep(500);
                        if(sendMsg.equals("끝")) {
                            System.out.println("서버 : 통신 종료");
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            // receivedThread
            Thread receivedThread = new Thread(() -> {
                //System.out.println("클라이언트 : 읽기 스레드 생성 완료");
                try {
                    // 버퍼 만들기(received)
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );
                    //System.out.println("클라이언트 : 읽기 버퍼 생성 완료");
                    while (true) {
                        String requestMsg = br.readLine();
                        System.out.println("서버로부터 받은 메세지 : " + requestMsg);
                        //System.out.println("서버로부터 받은 메세지 읽기 완료");
                        if(requestMsg.equals("끝")) {
                            System.out.println("서버 : 통신 종료");
                            break;
                        }
                        }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            sendThread.start();
            receivedThread.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
