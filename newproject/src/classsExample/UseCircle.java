package classsExample;

public class UseCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle(); // 같은 패키지 안에 있는 다른 클래스로 부터 가져온 객체
    c1.setRadius(20.0); // setter를 이용해 radius의 값을 "수정"했다
    System.out.println(c1.getRadius()); // getter를 이용해 radius의 값을 "참조"했다.

    Circle c2 = new Circle(30.0); //생성자에서 매개변수를 가질수 있게끔 설정했다.
    System.out.println(c2.getRadius());

    System.out.printf("원의 넓이 : %.2f", c2.findArea(30.0));
  }
}
