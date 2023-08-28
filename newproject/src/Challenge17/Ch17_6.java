//23.08.28 (월) : 이것이 자바다 17장 확인문제 6번
//List에 저장되어 있는 Member의 평균 나이를 출력하려고 합니다. 알맞은 코드를 작성해보세요.
package Challenge17;

import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.List;

public class Ch17_6 {
    public static void main(String[] args) {
      List<Member1> list = Arrays.asList(
          new Member1("홍길동", 30),
          new Member1("신용권", 40),
          new Member1("감자바", 24)
      );
      double avg = list.stream()
          .mapToInt(Member1::getAge) // 각 멤버의 나이로 매핑
          .average()                 // 평균 계산
          .orElse(0.0);          // 평균 값이 존재하지 않을 경우

      System.out.println("평균 나이: " + avg);
  }
}
class Member1 {
  private String name;
  private int age;
  public Member1(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() { return name; }
  public int getAge() { return age; }
}
