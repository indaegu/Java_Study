//23.08.18 (금) : 6장 연습문제 19번
package ChallengeCh06;

public class AccountTest {
  public static void main(String[] args) {
    Account account = new Account();

    account.setBalance(10000);
    System.out.println("현재 잔고 : " + account.getBalance());

    account.setBalance(-100);
    System.out.println("현재 잔고 : " + account.getBalance());
  }
}

class Account{
  private int balance;
  int MIN_BALANCE = 0;
  int MAX_BALANCE = 1_000_000;

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
}
