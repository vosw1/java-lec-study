package ex14.example1;

import java.time.LocalDateTime;

// DTO: 데이터 전송 오브젝트
class JoinDTO {
    private String username; // ssar
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "JoinDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Member {
    // counter 변수 0으로 셋팅
    // static으로 계속 띄워놔야 증감이 가능함
    private static int counter = 0;
    private int no;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt; // 회원가입된 시간

    public Member(JoinDTO dto, LocalDateTime createdAt) {
        this.no = ++counter; // no가 자동으로 증감
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        // d1과 d2를 Member 클래스로 옮긴 후 DB에 저장
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

        LocalDateTime now = LocalDateTime.now();

        // 객체 복사 : 클래스에 있는 데이터를 다른데 옮기는 방법
        Member member1 = new Member(d1, now);
        Member member2 = new Member(d2, now);

        System.out.println(member1);
        System.out.println(member2);
    }
}