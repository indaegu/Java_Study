// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭
package chapter09;

public class CheckDemo {
  public static void main(String[] args) throws InterruptedException {
//    try {
//      System.out.println("3초간 대기 시작");
//      Thread.sleep(3000);
//      System.out.println("3초간 대기 완료");
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }
    Thread.sleep(1000);
  }
}
