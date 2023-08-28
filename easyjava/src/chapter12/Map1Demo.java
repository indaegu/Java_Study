// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 매핑(중간처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 한다.)
package chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Map1Demo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
    Stream<String> s2 = s1.map(String::toUpperCase);
    s2.forEach(Util::print);
    System.out.println();

    Stream<String> s6 = Stream.of("a1", "b1", "b2", "c1", "c2");
    s6.map(s -> s.substring(1))
        .mapToInt(x->Integer.parseInt(x))
        .mapToObj(x->"b" + x)
        .forEach(System.out::println);

    Stream<Integer> i1 = Stream.of(1, 2, 1, 3, 3, 2, 4);
    Stream<Integer> i2 = i1.map(i -> i * 2);
    i2.forEach(Util::print);
    System.out.println();

    Stream<String> s3 = Stream.of("a1", "a2", "a3");
    Stream<String> s4 = s3.map(s -> s.substring(1));
    IntStream i3 = s4.mapToInt(Integer::parseInt);
    Stream<String> s5 = i3.mapToObj(i -> "b" + i);
    s5.forEach(Util::print);

    List<String> input1 = Arrays.asList("java8 lambda","stream mapping");
    input1.stream()
        .flatMap(data -> Arrays.stream(data.split(" "))) // space를 기준으로 원소를 나누어 새로운 Map을 만든다.
        .forEach(System.out::println);

    Stream<String> s7 = Stream.of("a1", "a2", "a3");
    s7.map(s -> s.substring(1))
        .mapToInt(x->Integer.parseInt(x))
        .mapToDouble(x-> x)
        .mapToObj(x->"a" + x)
        .forEach(System.out::println);

  }
}
