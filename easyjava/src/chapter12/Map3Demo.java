// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 매핑(중간처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 한다.)
package chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Map3Demo {
  public static void main(String[] args) {
    List<String> list1 = List.of("안녕, 자바!", "잘 가, C++!");
    Stream<String> s1 = list1.stream();
    Stream<String> s2 = s1.flatMap(s ->
        Arrays.stream(s.split(" ")));
    s2.forEach(Util::printWithParenthesis);
    System.out.println();
    List<String> list2 = List.of("좋은 아침");
    List<String> list3 = List.of("안녕! 람다", "환영! 스트림");
    Stream<List<String>> s3 = Stream.of(list1, list2, list3);
    Stream<String> s4 = s3.flatMap(list -> {
      if (list.size() > 1)
        return list.stream();
      else
        return Stream.empty();
    });
    s4.forEach(Util::printWithParenthesis);
  }
}