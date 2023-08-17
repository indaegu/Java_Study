// 23.08.17 (목) : 추상 메서드 실습
package chapter07;

public class AbstractMethodEx {
  public static void main(String[] args) {

  }
}
abstract class  AbstractClass{
   double PI =3.14;
   abstract void absMethod(); //Body도 없는 추상메서드
   abstract double getPI(); // 중간에 추상 메서드를 추가하면 추상 클래스를 상속했던 클래스들이 모두 오류가 난다.

}

class comClass extends AbstractClass{ //상속해서 추상 메서드를 사용한다.
  @Override
  void absMethod() {
    System.out.println("추상메서드 테스트");
  }

  @Override
  double getPI() {
    return 0;
  }
}
