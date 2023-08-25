// 23.08.25 (금) : 쉽게 배우는 자바 11장 (Collection) : 확인문제 3번(HashTable이용해 이름과 점수 저장)
package chapter11;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Ch11_3 {
  public static void main(String[] args) {
    Map<String, Integer> map = new Hashtable<>();

    map.put("김열공", 80);
    map.put("최고봉", 90);
    map.put("우등생", 95);
    map.put("나자바", 86);

    Scanner scanner = new Scanner(System.in);
    String findName;
      System.out.print("이름을 입력하세요 : ");
      findName = scanner.next();
      // findName의 키값을 이용해 해당하는 value를 출력하는 로직
      if (map.containsKey(findName)) { // findName이 map에 있는지 확인
        System.out.println(findName + "의 점수는 " + map.get(findName) + "점 입니다.");
      } else {
        System.out.println(findName + "의 정보를 찾을 수 없습니다.");
      }



  }
}
