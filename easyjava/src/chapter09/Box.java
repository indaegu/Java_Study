// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭 : 제네릭실습

package chapter09;

public class Box <T>{
  private T some;

  public T get() {
    return some;
  }

  public void set(T some) {
    this.some = some;
  }
}