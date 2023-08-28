// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 매핑(중간처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 한다.)
package chapter12;

import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Map2Demo {
  public static void main(String[] args) {
    Stream<Nation> n1 = Nation.nations.stream();
    Stream<String> s1 = n1.map(Nation::getName);
    s1.limit(4).forEach(Util::printWithParenthesis);
    System.out.println();

    Stream<Nation> n2 = Nation.nations.stream();
    IntStream is = n2.mapToInt(Nation::getGdpRank);
    is.forEach(Util::print);
  }
}