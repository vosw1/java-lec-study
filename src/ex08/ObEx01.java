package ex08;

class Account extends Object{
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

  /*  @Override
    public String toString() {
        return "안녕"; // 보통 객체 상태값을 적음
    }*/

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
    Account account = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        //System.out.println(account.toString());
        System.out.println(account.getClass());
        System.out.println(account.hashCode());
    }
}
