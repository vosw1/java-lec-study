package ex04.example;

import ex04.example.model.Account;

// 트랜잭션 관리
public class BankService {

    public static void withdrawal(Account withdrawalAccount, long amount){
        if (amount <= 0) {
            System.out.println("0원 이하 금액을 출금할 수 없습니다.");
            return;
        }
        if(withdrawalAccount.isBalanceInsufficient(amount)) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        withdrawalAccount.withdrawal(amount);
    }

    public static void transfer(Account withdrawalAccount, Account depositAccount, long amount) {
        //상태 확인도, 변경도 아님
        if (amount <= 0) {
            System.out.println("0원 이하 금액을 이체할 수 없습니다.");
            return;
        }

        // 이체 트랜잭션
        if(withdrawalAccount.isBalanceInsufficient(amount)) {
            System.out.println("잔액이 부족합니다");
            return;
        }

        withdrawalAccount.withdrawal (amount);
        depositAccount.deposit (amount);
    }
}
