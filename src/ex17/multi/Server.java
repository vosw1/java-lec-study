package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            //1. 소켓과 버퍼 만들기
            // main 스레드
            ServerSocket serverSocket = new ServerSocket(10000); // 리스너 소켓 생성
            Socket socket = serverSocket.accept(); // 대기중 -> 연결후 랜덤포트 소켓 생성
            //System.out.println("서버 : 연결 완료");

            // 2. 메세지 받기 스레드
            // receivedThread
            Thread receivedThread = new Thread(() ->{ // 스택이 달라서 readLine()에서 오류 발생
                //System.out.println("서버 : 읽기 스레드 생성 완료");
                try{
                    // 버퍼 만들기(received)
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );
                    //System.out.println("서버 : 읽기 버퍼 생성 완료");
                    System.out.println("서버 : 통신 연결 완료");
                    while(true) {
                        String requestMsg = br.readLine();
                        System.out.println("클라이언트로부터 받은 메세지 : " + requestMsg);
                        //System.out.println("클라이언트로부터 받은 메세지 읽기 완료");
                        if(requestMsg.equals("끝")) {
                            System.out.println("서버 : 통신 종료");
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            Thread sendThread = new Thread(() -> {
                //System.out.println("서버 : 쓰기 스레드 생성 완료");
                try {
                    // 버퍼 만들기(send)
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    //System.out.println("서버 : 쓰기 버퍼 생성 완료");
                    while (true) {
                        Scanner sc = new Scanner(System.in);
                        String sendMsg = sc.nextLine();
                        pw.println(sendMsg);
                        //System.out.println("서버 : 메세지 키보드로 받아서 보내기 완료");
                        if(sendMsg.equals("끝")) {
                            System.out.println("서버 : 통신 종료");
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            receivedThread.start();
            sendThread.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
