// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭 : 예외 떠넘기기 실습

package chapter09;

import java.util.Scanner;
public class ThrowsDemo {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
      System.out.print("제곱을 구하기 위한 정수를 입력하세요 : ");
      square(in.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("정수가 아닙니다.");
    }

  }
  private static void square(String s) throws NumberFormatException {

    int n = Integer.parseInt(s);
    System.out.printf("%s의 제곱 값은 : %d\n",s,n * n);

  }
}