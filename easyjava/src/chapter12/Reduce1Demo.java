//23/08.28 (월) : 쉽게배우는자바 12장 (스트림) : Reduce
package chapter12;

import java.util.List;
import java.util.Optional;

public class Reduce1Demo {
  public static void main(String[] args) {
    List<Integer> list = List.of(3,4,5,1,2);
    Optional<Integer> reduce = list.stream()
        .reduce((x, y) -> x + y);
    System.out.println(reduce.get());

  }
}
