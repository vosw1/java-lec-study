package ex02.example;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //1. 드라이브 이름 입력받기
        System.out.print("드라이브 이름: ");
        String driveName = sc.nextLine();

        //2. 디렉터리 이름 입력받기
        System.out.print("디렉터리 이름: ");
        String directoryName = sc.nextLine();

        //3. 파일 이름 입력받기
        System.out.print("파일 이름: ");
        String fileName = sc.nextLine();

        //4. 확장자 이름 입력받기
        System.out.print("확장자 이름: ");
        String fileExtensioName = sc.nextLine();

        //합치기
        System.out.println("완전한 이름은 " + driveName + ":" + directoryName + fileName + "." + fileExtensioName);
    }
}
