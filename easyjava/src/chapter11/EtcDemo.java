// 23.08.25 (금) : 쉽게 배우는 자바 11장 (Collection) : 기타
package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EtcDemo {
  public static void main(String[] args) {
    List<String> list1 = List.of("A","A","A", "B", "B", "C","D","E");
    HashSet<String> set = new HashSet<>(list1);
    List<String> list2 = new ArrayList<>(list1);

    System.out.println(set.size()); // 5이 출력된다
    System.out.println(list2.size()); // 8이 출력된다

  }
}
