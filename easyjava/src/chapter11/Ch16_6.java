// 23.08.25 (금) : 이것이 자바다 16장 (Lambda) : 확인문제 6번
package chapter11;

public class Ch16_6 {
  public static double calc(calc fun) {
    double x = 10;
    double y = 4;
    return fun.apply(x, y);
  }
  public static void main(String[] args) {
    double result = calc( (x, y) -> (x / y) );
    System.out.println("result: " + result);
  }

}
@FunctionalInterface
interface calc{
  double apply(double x, double y);

}


