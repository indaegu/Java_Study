package classsExample;
// 상속 사용 예시
public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();// Animal의 부모 클래스인 Object
    Tiger tiger = new Tiger();
    Bird bird; //4바이트 짜리 공간확보, null 값이 들어가있음
    bird = new Bird(); // new Bird()를 통해 주소값을 만들어내고 그 값을 bird에 대입
//    Bird bird = new Bird();
    Fish fish = new Fish();
    bird.먹는다(); //Animal로 부터 상속 받은 Method를 사용할 수 있다.
    tiger.달린다(); //Animal로 부터 상속 받은 Method를 사용할 수 있다.
    bird.toString();


    bird.움직인다(); // Overriding 으로 인해 모두 동일한 "움직인다" 이지만 결과 값이 다르게 나타난다
    fish.움직인다(); // 객체에 따라 메서드를 다르게 동작하도록 구현할 수 있다.5
    tiger.움직인다();

  }
}
