// 23.08.25 (금) : 쉽게 배우는 자바 11장 (Collection) : Map 인터페이스
package chapter11;

import java.util.Map;
public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits =
        Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
    System.out.println(fruits.size() + "종류의 과일이 있습니다.");
    System.out.println(fruits);
    for (String key : fruits.keySet())
      System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");
    String key = "바나나";
    if (fruits.containsKey(key))
      System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");

    fruits.forEach((k, n) -> System.out.print(k + "(" + n + ") "));// 람다 표현식
    /* 람다 표현식이란?
     fruits: 이것은 Map 타입의 객체입니다. Map은 키-값 쌍으로 데이터를 저장하는 자바의 데이터 구조입니다.
     forEach: Map의 메서드 중 하나로, 각 키-값 쌍에 대해 주어진 작업을 수행합니다.
     (k, n): forEach 메서드에 전달되는 람다 표현식의 매개변수입니다. 여기서 k는 키를 나타내고, n은 그에 상응하는 값을 나타냅니다.
     ->: 이 기호는 람다 표현식을 나타냅니다. 왼쪽에는 매개변수가 위치하고, 오른쪽에는 실행될 코드가 위치합니다.
     System.out.print(k + "(" + n + ") "): 이 코드는 키와 값을 출력하는 코드입니다. 각 키와 값은 괄호 안에 표시되고, 키와 값 사이에는 공백이 있습니다.
    */
/*
    fruits.put("키위", 2);
    fruits.remove("사과");
    fruits.clear();
*/
  }
}