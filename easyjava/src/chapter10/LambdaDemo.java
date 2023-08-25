// 23.08.25 (금) : 이것이자바다 16장 (Lambda) :

package chapter10;

import java.security.PrivilegedAction;
import java.util.function.BiConsumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntBinaryOperator;

public class LambdaDemo {
  public static void main(String[] args) {
    IntBinaryOperator intBinaryOperator = (int a, int b) -> a > b ? a : b;

    BiConsumer<String, Integer> printer = (name, i) -> System.out.println(name + "=" + i);
    printer.accept("exampleName", 123);

    DoubleToIntFunction doubleToIntFunction = (DoubleToIntFunction) x -> (int) (x * x);

    PrivilegedAction<Integer> integerPrivilegedAction = () -> (int) (Math.random() * 6);

    Object obj = new Object(){
      int max(int a, int b){
        return a>b?a:b;
      }
    };

    // obj.max 부모는 자식의 메서드를 사용 불가능하다.


  }
}
