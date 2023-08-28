//23.08.28 (월) : 이것이 자바다 17장 확인문제 8번
//List에 저장되어 있는 Member를 직업별로 그룹핑해서 Map<String,List<Member>> 객체로생성하려고 합니다.
// 키는 Member의 직업이고, 값은 해당 직업을 갖는 Member들을 저장하고 있는 List입니다. 알맞은 코드를 작성해보세요.
package Challenge17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ch17_8 {
  public static void main(String[] args) {
    List<Member3> list = Arrays.asList(
        new Member3("홍길동", "개발자"),
        new Member3("김나리", "디자이너"),
        new Member3("신용권", "개발자")
    );
    Map<String, List<Member3>> groupingMap = list.stream()
        .collect(Collectors.groupingBy(Member3::getJob)); // 직업별로 그룹화

    System.out.println("[개발자]");
    groupingMap.get("개발자").forEach(System.out::println);

    System.out.println();
    System.out.println("[디자이너]");
    if (groupingMap.get("디자이너") != null) {
      groupingMap.get("디자이너").forEach(System.out::println);
    }
  }
}
 class Member3 {
  private String name;
  private String job;
  public Member3(String name, String job) {
    this.name = name;
    this.job = job;
  }
  public String getName() { return name; }
  public String getJob() { return job; }
  @Override
  public String toString() {
    return "{name:" + name + ", job:" + job + "}";
  }
}
