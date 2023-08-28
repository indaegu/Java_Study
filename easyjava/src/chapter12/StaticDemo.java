// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 매핑(매치)
package chapter12;

import java.util.stream.Stream;

public class StaticDemo {
  public static void main(String[] args) {
    Stream<String> ss = Stream.of("a","bb","ccc");
    System.out.println(ss.max((x,y)->x.length() - y.length()).get());
  }
}
