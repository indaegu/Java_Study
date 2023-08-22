//23.08.22 (화) : 이것이 자바다. 확인문제 9장 6번, 익명 구현 객체를 필드와 로컬 변수의 초기값 그리고 메소드의 매개값으로 대입
package Challenge09;

public interface Vehicle {
  public void run();
}
class Anonymous{

  Vehicle field = new Vehicle() {
    @Override
    public void run() {
      System.out.println("자전거가 달립니다");
    }
  };

  void method1(){
    Vehicle localVar = new Vehicle() {
      @Override
      public void run() {
        System.out.println("승용차가 달립니다.");
      }
    };

    localVar.run();
  }

  void method2(Vehicle v){
    v.run();
  }
}
