// 23.08.17 (목) : 다형성 실습

package ChallengeCh06;

public class OverrideTest {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000,5);
    c.show();

    Vehicle v = c;
    v.show(); //메서드는 항상 Override된 결과가 출력된다
  }
}
