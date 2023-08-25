// 23.08.25 (금) : 이것이자바다 16장 (Lambda) :
package chapter10;

import java.util.function.Predicate;

public class FunctionalInterface2Demo {
  public static void main(String[] args) {
    Predicate<String> isEmptyStr = s -> s.length()==0;
    String s = "asdasd";
    if(isEmptyStr.test(s)) // if(s.length()==0)
      System.out.println("This is an empty String.");
    else{
      System.out.println(s);
    }

    Predicate<Integer> isZero = num -> num==0;
    int num = 0;
        if(isZero.test(num)) // if(s.length()==0)
      System.out.println("Num isZero");
    else{
      System.out.println(num);
    }

  }
}

