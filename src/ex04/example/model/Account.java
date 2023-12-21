package ex04.example.model;

// 객체의 상태를 변경, 객체의 상태를 확인(private이기 때문)
public class Account {
    private final int id;
    private long balance;
    private int userId;

    // 잔액 확인(상태 확인)
    public boolean isBalanceInsufficient(long amount) {
        if(balance < amount){
            return true;
        }
        return false;
    }

    // 메서드는 하나의 책임만 가짐
    public void withdrawal(long amount) { // 객체의 상태 변경
        this.balance = this.balance - amount;
    }

    public void deposit(long amount) {
        this.balance = this.balance + amount;
    }

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
