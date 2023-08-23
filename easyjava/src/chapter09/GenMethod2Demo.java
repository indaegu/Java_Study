// 23.08.23 (수) : 쉽게 배우는 자바 9장 제네릭 제네릭 메서드 (제네릭 타입에 대한 범위 제한)

package chapter09;

public class GenMethod2Demo {
  public static void main(String[] args) {
    Integer[] ia = { 1, 2, 3, 4, 5 };
    Double[] da = { 1.0, 2.0, 3.0, 4.0, 5.0 };
    Character[] ca = { 'H', 'E', 'L', 'L', 'O' };
    Utils.showArray(ia);
    Utils.showArray(da);
// Utils.<Character>showArray(ca);

  }
  class Utils {
    public static <T extends Number> void showArray(T[] a) {
      for (T t : a)
        System.out.printf("%s ", t);
      System.out.println();
    }
  }
}
