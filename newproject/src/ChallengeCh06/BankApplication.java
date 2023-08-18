package ChallengeCh06;

import java.util.Scanner;

public class BankApplication {
  static BankAccount[] accounts = new BankAccount[100]; // 100개의 계좌정보를 담을수 있는 배열객체 생성 / static으로 선언해서 다른 static에서도 사용가능
  static Scanner scanner = new Scanner(System.in); // scanner 선언
  static int menu =0;
  public static void main(String[] args) {
    while (menu!=5){
      System.out.println("--------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("--------------------------------------------");
      System.out.print("선택> ");
      menu = scanner.nextInt();
      switch (menu){
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          depositMoney();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          System.out.println("프로그램 종료");
          break;
        default:
          System.out.println("error");
          break;
      }

    }
  }
  static int accountIndex = 0;  // 계좌를 저장할 배열의 인덱스
  static void createAccount(){
    System.out.println("----------");
    System.out.println("  계좌생성  ");
    System.out.println("----------");
    //로직 작성
    System.out.print("계좌 번호를 입력하세요: ");
    String accountNum = scanner.next();
    System.out.print("계좌 주인 이름을 입력하세요: ");
    String ownerName = scanner.next();
    System.out.print("초기입급액: ");
    int balance = scanner.nextInt();

    BankAccount newAccount = new BankAccount();
    newAccount.setAccountNumber(accountNum);
    newAccount.setAccountOwner(ownerName);
    newAccount.setBalance(balance);

    accounts[accountIndex++] = newAccount;
    System.out.println("계좌가 생성되었습니다.");
  }
  static void accountList(){
    System.out.println("----------");
    System.out.println("  계좌목록  ");
    System.out.println("----------");
    //로직 작성
    for(int i=0; i<accountIndex; i++){
      System.out.println("계좌 번호: " + accounts[i].getAccountNumber() + ", 계좌 주인: " + accounts[i].getAccountOwner()+
          ", 잔액: " + accounts[i].getBalance());
    }
  }
  static void depositMoney(){
    System.out.println("----------");
    System.out.println("   예금  ");
    System.out.println("----------");
    //로직 작성
    System.out.print("계좌 번호를 입력하세요: ");
    String accountNum = scanner.next();
    System.out.print("입금할 금액을 입력하세요: ");
    int amount = scanner.nextInt();

    for(int i=0; i<accountIndex; i++){
      if(accounts[i].getAccountNumber().equals(accountNum)){
        accounts[i].deposit(amount);
        System.out.printf("%s 계좌로 %d원 입금이 완료되었습니다.\n",accountNum,amount);
        return;
      }
    }
  }

  static void withdraw(){
    System.out.println("----------");
    System.out.println("   출금  ");
    System.out.println("----------");
    //로직 작성
    System.out.print("계좌 번호를 입력하세요: ");
    String accountNum = scanner.next();
    System.out.print("출금할 금액을 입력하세요: ");
    int amount = scanner.nextInt();

    for(int i=0; i<accountIndex; i++){
      if(accounts[i].getAccountNumber().equals(accountNum)){
        accounts[i].withdraw(amount);
        System.out.printf("%s 계좌에서 %d원 출금이 완료되었습니다.\n",accountNum,amount);
        return;
      }
    }
    System.out.println("해당 계좌 번호를 찾을 수 없습니다.");
  }
}
