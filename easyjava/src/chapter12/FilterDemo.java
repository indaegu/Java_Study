// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : filter,skip,forEach
package chapter12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    String[] sa = {"a1","b1","c1","c2","c3"};

    Arrays.stream(sa)
        .filter(s ->s.startsWith("c"))
        .skip(1)
        .forEach(System.out::println);

    IntStream ints = new Random().ints(0,10);
    ints.limit(5)
        .filter(x -> x %2 ==0)
        .forEach(System.out::println);

    //nation 클래스에서 인구가 1억 이상인 나라 2개만 출력하기
    System.out.print("인구가 1억(100백만) 이상의 2개 나라 : ");
    Nation.nations.stream()
        .filter(p -> p.getPopulation() >= 100.0) //(100백만)
        .limit(2)
        .forEach(Util::printWithParenthesis);


//    Stream<Nation> n1 = Nation.nations.stream();
//    Stream<Nation> n2 = n1.filter(p -> p.getPopulation() > 100.0);
//    Stream<Nation> n3 = n2.limit(2);
//    n3.forEach(Util::printWithParenthesis);

    
  }
}
