package classExample2;
// 싱글톤 패턴
public class SingletonTest {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance(); // private로 설정된 class를 getInstance로 받아온다.
    Singleton singleton2 = Singleton.getInstance(); // sigleton1과 singleton2는 동일하다. 이러한 패턴을 싱글톤패턴이라고 한다.
    System.out.println(singleton1);
    System.out.println(singleton2);
  }
}
