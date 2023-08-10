package classsExample;

public class UseCircle {
  public static void main(String[] args) {
    Circle c = new Circle(); // 같은 패키지 안에 있는 다른 클래스로 부터 가져온 객체
    c.setRadius(20.0); // setter를 이용해 radius의 값을 "수정"했다
    System.out.println(c.getRadius()); // getter를 이용해 radius의 값을 "참조"했다.

    Circle c2 = new Circle(30.0); //생성자에서 매개변수를 가질수 있게끔 설정했다.
    System.out.println(c.getRadius());


  }
}
