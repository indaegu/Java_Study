// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : Optional
package chapter12;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Optional1Demo {
public static OptionalDouble divide(double x, double y){
  return (y==0) ? OptionalDouble.empty(): OptionalDouble.of(x/y); //오류 방지를 위한 부재 처리
}

  public static OptionalInt divide(int x, int y){
    return (y==0) ? OptionalInt.empty(): OptionalInt.of(x/y); //오류 방지를 위한 부재 처리
  }

  public static void main(String[] args) {
    //double형
    OptionalDouble divide = divide(10.0,2.0);
    System.out.println(divide);
    System.out.println(divide.getAsDouble());
    System.out.println(10/2.0); // 언박싱할 필요가 없다

    OptionalDouble divideZero = divide(10.0,0);
    System.out.println(divideZero);


    //int 형
    OptionalInt divide1 = divide(10,1);
    System.out.println(divide1);
    System.out.println(divide1.getAsInt());
    System.out.println(10/1); // 언박싱할 필요가 없다

    OptionalInt divideZero1 = divide(10,0);
    System.out.println(divideZero1);

    Optional<String> apple = Optional.of("apple");
    System.out.println(apple);
    System.out.println(apple.get()); // Optional은 자동 언박싱이 안되기 때문에 꺼내와서 사용해야함


  }


}
