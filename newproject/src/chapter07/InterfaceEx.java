//23.08.17 (목) : 인터페이스 실습
package chapter07;

public class InterfaceEx {
  public static void main(String[] args) {
    C1 c1 =new C1();
    c1.defaultMethod();

    C2 c2 = new C2();
    c2.method1();
    c2.method2();
    c2.defaultMethod();
  }
}