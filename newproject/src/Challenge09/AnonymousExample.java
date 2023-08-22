//23.08.22 (화) : 이것이 자바다. 확인문제 9장 6번, 익명 구현 객체를 필드와 로컬 변수의 초기값 그리고 메소드의 매개값으로 대입
package Challenge09;

public class AnonymousExample {
  public static void main(String[] args) {
    Anonymous anony = new Anonymous();
    anony.field.run();
    anony.method1();
    anony.method2(new Vehicle() {
      @Override
      public void run() {
        System.out.println("트럭이 달립니다.");
      }
    });
  }
}