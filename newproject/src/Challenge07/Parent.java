// 23.08.18 (금) : 7장 확인문제 7번 super를 이용 실습

package Challenge07;

public class Parent {
  public String nation;
  public Parent() {
    this("대한민국");
    System.out.println("Parent() call");
  }
  public Parent(String nation) {
    this.nation = nation;
    System.out.println("Parent(String nation) call");
  }
}
class Childs extends Parent {
  public String name;
  public Childs() {
    this("홍길동");
    System.out.println("Child() call");
  }

  // Java에서 클래스의 생성자는 해당 클래스의 부모 클래스의 생성자를 먼저 호출합니다.
  // super()는 부모 클래스의 기본 생성자를 호출하며, 생략되어 있을 경우 컴파일러가 자동으로 추가합니다.
  public Childs(String name) {
    this.name = name;
    System.out.println("Child(String name) call");
  }
}