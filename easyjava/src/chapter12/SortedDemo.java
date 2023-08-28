// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 매핑(역순처리)
package chapter12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1","a2","d2","b1","c2");
    s1.sorted(Comparator.reverseOrder())
        .forEach(Util::print); // "::" 메서드 참조연산자 :  메서드를 직접 호출하는 대신 해당 메서드의 참조를 전달할 수 있습니다.
                              // 예를 들어, Nation::getName은 Nation 객체의 getName 메서드를 참조합니다.
//    s1.sorted((x,y)->y.hashCode() - x.hashCode())
//        .forEach(Util::print);
    System.out.println();
    Nation.nations.stream()
        .sorted(Comparator.comparing(Nation::getName))
        .map(Nation::getName)//.map을 하지 않아도 Name이 출력되나 -> Nation 클래스에 toString에서 return값이 name이기 때문
        .forEach(Util::printWithParenthesis);

    System.out.println();
    Nation.nations.stream()
        .sorted(Comparator.comparing(Nation::getGdpRank))
        .map(Nation::getName)
        .forEach(Util::printWithParenthesis);
  }
}
