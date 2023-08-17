//23.08.17 (목) : 인터페이스 실습
package chapter07;

public interface A {
  void method1(); //public abstract가 생략되었음, 컴파일시 자동으로 추가됨
  void method2(); // 뒤늦게 추가되면서 다른 모든 메서드에 오류 발생 -> 모두 다 추기해줘야함, 따라서 처음부터 설계를 잘해야한다.
  
  default void defaultMethod(){
    System.out.println("defaultMethod는 다른 메서드에 에러가 발생하지 않음");
  } //defaultMethod는 다른 메서드에 에러가 발생하지 않음
  
}

class C1 implements A{
  @Override
  public void method1() {
    
  }

  @Override
  public void method2() {

  }
}

class C2 implements A{

  @Override
  public void method1() {
    
  }

  @Override
  public void method2() {

  }
}

class C3 implements A{
  @Override
  public void method1() {

  }

  @Override
  public void method2() {

  }
}
