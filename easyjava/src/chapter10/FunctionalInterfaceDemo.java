// 23.08.25 (금) : 이것이자바다 16장 (Lambda) :
package chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
//    MyFunction f = new MyFunction() {
//
//      public int max(int a, int b) {
//        return a > b ? a : b;
//      }
//    };

    MyFunction f =  (a,b) -> a > b ? a : b;    //람다식으로 간단하게 표현
    int max = f.max(4, 6);
    System.out.println(max);

    List<String> list = Arrays.asList("abc","aaa","bbb","ddd","aaa");
    Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
    System.out.println(list);




  }
}

@FunctionalInterface //하나의 메서드만 선언하라고 알려주는 용도
interface MyFunction{ //이렇게 선언된 단 하나의 추상 메서드를 가진 인터페이스는 부모가 자식의 메서드 사용가능
       int max(int a, int b);
       // 두 개의 메서드를 만들면 컴파일에서 오류가 난다.
}