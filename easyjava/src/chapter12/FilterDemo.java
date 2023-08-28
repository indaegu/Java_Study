// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : Optional
package chapter12;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    String[] sa = {"a1","b1","c1","c2","c3"};

    Arrays.stream(sa)
        .filter(s ->s.startsWith("c"))
        .skip(1)
        .forEach(System.out::println);


  }
}
