// 23.08.23 (수) : 쉽게배우는자바 8장 확인문제 1번
// 반지름이 같은 Circle 객체를 모두 동일한 종류로 취급하는 Circle 클래스를 작성하고 다음 프로그램으로 검증하시오.
package chapter08;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if(c1.equals(c2)){
      System.out.println("같다");
    }else{
      System.out.println("다르다");
    }

  }
}
