package ex04.example.model;

public class User {
    final int id; // heap에 여러 개가 뜰 수 있어 구분이 필요함
    String name;
    String email;

    // 생성자
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
