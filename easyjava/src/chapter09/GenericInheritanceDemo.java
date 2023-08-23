// 23.08.23 (수) : 쉽게 배우는 자바 9장 제네릭 제네릭 타입의 상속 관계

package chapter09;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beer> a1 = new ArrayList<>();
    ArrayList<Boricha> a2 = new ArrayList<>();
    ArrayList<Beverage> a3 = new ArrayList<>();
    a3.add(new Beverage());
    a3.add(new Beer());
    a3.add(new Boricha());
    Beer beverage = (Beer) a3.get(1);
    System.out.println(beverageTest(a3)); // a1, a2, a3의 ArrayList들은 서로 상속관계가 없다.
  }
  static boolean beverageTest(ArrayList<Beverage> array){
    return true;
  }

}
