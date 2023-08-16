//23.08.16 (수) : chapter 4 확인 문제
package ChallengeCh4;

import java.util.Scanner;

public class Ch4_7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        long sum = 0L;
        int menu = 0;
        while (menu!=4){
            System.out.println("==============================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("==============================\n");
            System.out.print("선택>");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.print("예금액>");
                    long money = scanner.nextLong();
                    sum += money;
                    break;
                case 2:
                    System.out.print("출금액>");
                    money = scanner.nextLong();
                    sum -= money;
                    break;
                case 3:
                    System.out.println("잔고>" + sum);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    menu = 4;
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}
