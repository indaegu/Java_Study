// 23.08.25 (금) : 쉽게 배우는 자바 11장 (Collection) : 탐색하기
package chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SearchDemo {
  public static void main(String[] args) {

// 문자열 배열 s를 선언하고 초기화
    String[] s = {"같이", "돌", "보라", "황금을"};

// 배열 s를 List<String> 타입으로 변환하여 list 변수에 할당
    List<String> list = Arrays.asList(s);

// list의 요소들을 자연 순서대로 정렬
    Collections.sort(list);

// 정렬된 list의 내용을 출력
    System.out.println(list);

// 정렬된 list에서 빈 문자열(" ")의 위치를 이진 검색으로 찾기
// 참고로, 이 코드에서 빈 문자열(" ")은 list에 존재하지 않기 때문에 음수 값이 반환됨
    int i = Collections.binarySearch(list, " ");

// 찾은 위치(인덱스)를 출력
    System.out.println(i);
  }
}
