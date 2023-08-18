//23.08.18 (금) : 6장 연습문제 19번, 20번
package ChallengeCh06;

public class Account {
    private int balance;

  private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 1_000_000;

    public Account(int balance) {
      this.balance = balance;
    }

    public Account(){};

    public int getBalance() {
      return balance;
    }

    public void setBalance(int balance) {
      if(balance >=MIN_BALANCE && balance <= MAX_BALANCE)
      {
        this.balance = balance;
      }else
      {
        System.out.println("error");
      }
    }

    public void withdraw(int withdrawBalance){
      if((this.balance - withdrawBalance) >=MIN_BALANCE && (this.balance - withdrawBalance) <= MAX_BALANCE)
      {
        this.balance = this.balance - withdrawBalance;
      }else
      {
        System.out.println("잔고 부족");
      }
    }

    public void deposit(int depositBalance){
      if((this.balance + depositBalance) >=MIN_BALANCE && (this.balance + depositBalance) <= MAX_BALANCE)
      {
        this.balance = this.balance + depositBalance;
      }else
      {
        System.out.println("입금 최대 금액 초과");
      }
    }


}
