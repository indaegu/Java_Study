// 23.08.23 (수) : 쉽게배우는자바 8장 확인문제 4번 Dice
package chapter08;

public class DiceTest {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(new Dice().roll());
    }
  }
}
