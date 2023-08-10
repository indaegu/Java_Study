package control;

import java.util.Scanner;

public class SimpleIf {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("숫자를 입력해주세요 : ");
    int num = scanner.nextInt();
    if (num % 2 == 0) {
      System.out.println("짝수입니다. ");
    }
    else {
      System.out.println("홀수입니다. ");
    }
  }
}
