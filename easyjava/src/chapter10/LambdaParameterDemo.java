// 23.08.25 (금) : 이것이자바다 16장 (Lambda) :
package chapter10;

import java.util.function.Predicate;

public class LambdaParameterDemo {
  public static void main(String[] args) {
    MyFunction f = (a,b) -> a> b ? a: b;
    myMethod(f);
    MyFunction myFunction = myFunction2();
    System.out.println(myFunction.max(10, 20));
  }

  static void myMethod(MyFunction f){
    System.out.println(f.max(3,5));
  }
  static MyFunction myFunction2(){
    MyFunction f = (a,b) -> a> b ? a: b;
    return f;
  }
}