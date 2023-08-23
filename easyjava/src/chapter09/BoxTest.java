// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭 : 제네릭실습
package chapter09;

public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf(100));
    System.out.println(i.get());

    Box<String> s = new Box<>();
    s.set("만능이네!");
    System.out.println(s.get());
  }
}
