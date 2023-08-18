//23.08.18 (금) : 6장 연습문제 19번, 20번
package ChallengeCh06;

public class BankAccount {
    private int balance;
    private String accountNumber;
    protected String accountOwner;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  private final int MIN_BALANCE = 0;

    public BankAccount(int balance) {
      this.balance = balance;
    }

    public BankAccount(){};

    public int getBalance() {
      return balance;
    }

    public void setBalance(int balance) {
      if(balance >=MIN_BALANCE)
      {
        this.balance = balance;
      }else
      {
        System.out.println("error");
      }
    }

    public void withdraw(int withdrawBalance){
      if((this.balance - withdrawBalance) >= MIN_BALANCE)
      {
        this.balance = this.balance - withdrawBalance;
      }else
      {
        System.out.println("잔고 부족");
      }
    }

    public void deposit(int depositBalance){
      if((this.balance + depositBalance) >=MIN_BALANCE)
      {
        this.balance = this.balance + depositBalance;
      }else
      {
        System.out.println("입금 최대 금액 초과");
      }
    }
}
