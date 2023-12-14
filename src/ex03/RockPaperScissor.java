package ex03;


import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        //1. 가위 바위 보 설정
        int SCISSOR = 0;
        int ROCK = 1;
        int PAPER = 2;

        //2. 가위 바위 보 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2): ");
        int user = sc.nextInt();

        //3. 컴퓨터가 랜덤함수로 가위 바위 보 선택하기
        int computer = (int) (Math.random() * 3);
        System.out.print("인간: " + user + " 컴퓨터: " + computer);

        //4. 결과 안내하기
        if(user == computer){
            System.out.println(" 비겼습니다");
        } else if (user == (computer + 1) % 3) {
            System.out.println(" 인간 승리");
        } else {
            System.out.println(" 컴퓨터 승리");
        }
    }
}
