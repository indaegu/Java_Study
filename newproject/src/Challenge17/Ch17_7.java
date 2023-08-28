//23.08.28 (월) : 이것이 자바다 17장 확인문제 7번
//List에 저장되어 있는 Member 중에서 직업이 ‘개발자’인 사람만 별도의 List에 수집하려고 합니다. 알맞은 코드를 작성해보세요.
package Challenge17;
import java.util.Arrays;
import java.util.List;

public class Ch17_7 {
    public static void main(String[] args) {
      List<Member2> list = Arrays.asList(
          new Member2("홍길동", "개발자"),
          new Member2("김나리", "디자이너"),
          new Member2("신용권", "개발자")
      );
      List<Member2> developers = list.stream()
              .filter(x->x.getJob()=="개발자")
                  .toList();
      developers
          .stream()
          .forEach(m -> System.out.println(m.getName()));
  }
}

class Member2 {
  private String name;
  private String job;
  public Member2(String name, String job) {
    this.name = name;
    this.job = job;
  }
  public String getName() { return name; }
  public String getJob() { return job; }
}
