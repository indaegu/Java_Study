// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭 : 제네릭실습

package chapter09;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    ArrayList nums = new ArrayList();
    nums.add(10); // Integer 타입으로 auto-boxing 됨
    nums.add(3.14); // Double 타입으로  auto-boxing 됨
    nums.add("Hello"); // String으로 타입으로  auto-boxing 됨

    for (int i = 0; i < nums.size(); i++) {
      if(nums.get(i) instanceof Integer){
        System.out.println((Integer)(nums.get(i))*2);
      } else if (nums.get(i) instanceof Double) {
        System.out.println((Double) (nums.get(i))*2);
      } else if (nums.get(i) instanceof String) {
        System.out.println("숫자 타입이 아닙니다");
      } else{
        System.out.println("처리할 수 없는 입력값입니다");
      }
    }
  }
}
