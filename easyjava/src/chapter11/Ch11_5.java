// 23.08.25 (금) : 쉽게 배우는 자바 11장 (Collection) : 확인문제 5번
//◼ HashMap의 원소는 키로 한글 동물 이름, 값으로 소문자 영어 동물 이름으로 구성되어 있는데,
// 다음 실행 결과가 나타나도록 Map 인터페이스의 replaceAll()를 사용하여 프로그램하라.
//1. Map.of를 이용하여 먼저 값을 입력받고 HashMap으로 옮겨준다.
//2. 문제 조건의 replaceAll() 함수를 해준다.
package chapter11;

import java.util.HashMap;
import java.util.Map;

public class Ch11_5 {
  public static void main(String[] args) {
    // 1. Map.of를 이용하여 먼저 값을 입력받고 HashMap으로 옮겨준다.
    Map<String, String> animalMap = new HashMap<>(Map.of("호랑이", "tiger", "표범", "lepard", "사자", "lion"));

    // 출력 (변경 전)
    System.out.println("변경 전: " + animalMap);

    // 2. 문제 조건의 replaceAll() 함수를 해준다.
    animalMap.replaceAll((k, v) -> v.toUpperCase());

    // 출력 (변경 후)
    System.out.println("변경 후: " + animalMap);
  }
}
