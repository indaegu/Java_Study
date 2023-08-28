// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 매핑(매치)
package chapter12;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
    boolean b = Stream.of("a1","b1","c1").anyMatch(x->x.startsWith("c"));
    System.out.println(b);

    boolean b1 = IntStream.of(1,3,5,7,9).allMatch(n->n%2==1);
    System.out.println(b1);

    int[] arr = {2,3,5,7,9};
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "는 홀수 입니다\n"); if(arr[i]%2==1){

      }else{
        System.out.println(arr[i] + "는 홀수가 아닙니다.");
      }
    }

    System.out.println();
    boolean na = Nation.nations.stream()
        .allMatch(x->x.getPopulation()>=100);
  }
}
