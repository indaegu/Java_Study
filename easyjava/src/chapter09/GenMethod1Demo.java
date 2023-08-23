// 23.08.23 (수) : 쉽게 배우는 자바 9장 제네릭 제네릭 메서드(두가지 타입 받기)
package chapter09;

public class GenMethod1Demo {
  public static void main(String[] args) {
    Integer[] ia = { 1, 2, 3, 4, 5 };
    Character[] ca = { 'H', 'E', 'L', 'L', 'O' };
    Utils.showArray(ia);
    Utils.<Character>showArray(ca);
    System.out.println(Utils.getLast(ia));
  }
}
class Utils {
  public static <T> void showArray(T[] a) {
    for (T t : a) // 하나의 showArray 메서드가 두가지 타입을 모두 받을 수 있다.
      System.out.printf("%s ", t);
    System.out.println();
  }
  public static <T> T getLast(T[] a) {
    return a[a.length - 1];
  }

}