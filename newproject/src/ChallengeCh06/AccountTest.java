//23.08.18 (금) : 6장 연습문제 19번 변형
package ChallengeCh06;

public class AccountTest {
  public static void main(String[] args) {
    Account account = new Account();

    account.setBalance(10000);
    System.out.println("setBalance 후 현재 잔고 : " + account.getBalance());

    account.setBalance(-100);
    System.out.println("setBalance 후 현재 잔고 : " + account.getBalance());

    account.setBalance(2_000_000);
    System.out.println("setBalance 후 현재 잔고 : " + account.getBalance());

    account.setBalance(300_000);
    System.out.println("setBalance 후 현재 잔고 : " + account.getBalance());

    account.withdraw(300_000);
    System.out.println("withdraw 후 현재 잔고 : " + account.getBalance());

    account.withdraw(100);
    System.out.println("withdraw 후 현재 잔고 : " + account.getBalance());

    account.deposit(1_000_000);
    System.out.println("deposit 후 현재 잔고 : " + account.getBalance());

    account.deposit(100);
    System.out.println("deposit 후 현재 잔고 : " + account.getBalance());


  }
}