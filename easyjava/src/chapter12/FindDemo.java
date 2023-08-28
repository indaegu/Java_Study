// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 매핑(매치)
package chapter12;

import java.util.Optional;


public class FindDemo {
  public static void main(String[] args) {
    Optional<Nation> first = Nation.nations.stream()
        .limit(4)
        .findFirst();
    System.out.println(first.get());

    Optional<Nation> second = Nation.nations.stream()
        .skip(1)
        .findFirst();
    System.out.println(second.get());

    Optional<Nation> any = Nation.nations.stream()
        .filter(Nation::isIsland)
        .findAny(); //findAny를 해도 매번 맨 처음 원소를 가져옴
    System.out.println(any.get());
  }
}
