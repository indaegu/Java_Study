package classsExample;
// 상속 사용 예시
public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();// Animal의 부모 클래스인 Object

    Bird bird = new Bird();
    bird.먹는다(); //Animal로 부터 상속 받은 Method를 사용할 수 있다.

    Tiger tiger = new Tiger();
    tiger.달린다(); //Animal로 부터 상속 받은 Method를 사용할 수 있다.
  }
}
