// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 스트림 소개
package chapter12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arrays2StreamDemo {
  public static void main(String[] args) {
    int[] ia = {1,2,3,4,5};
    IntStream stream = Arrays.stream(ia);

    String[] sa ={"a","b","c","d"};
    Stream<String> sa1 =Stream.of(sa);

    double[] da = {1.2, 3.14, 5.2};
    DoubleStream.of(da);
  }
}
