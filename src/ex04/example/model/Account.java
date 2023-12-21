package ex04.example.model;

public class Account{
    final int id; // 계좌번호 (숫자 4자리로 만들어져있다)
    long balance; //
    int userId; // 1:ssar의 계좌 -> 부식별자가 필요함

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
