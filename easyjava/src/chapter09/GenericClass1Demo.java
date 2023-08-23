// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭 : 제네릭실습

package chapter09;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericClass1Demo {
  public static void main(String[] args) {

    ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
    arrayListBoricha.add(new Boricha());
    // arrayListBoricha.add(new Beer()); // 다른형이라 오류 발생, 컴파일에서 먼저 오류를 발생시킴, 기존엔 실행 후에 오류 발생

    ArrayList<Beer> arrayListBeer =new ArrayList<>();
    // arrayListBeer.add(new Boricha());/ / 다른형이라 오류 발생

    Cup c = new Cup();
    c.setBeverage(new Boricha());
    if(c.getBeverage() instanceof Boricha){
      Boricha boricha = (Boricha) c.getBeverage();

    }else if (c.getBeverage() instanceof Beer){
      Beer beer = (Beer) c.getBeverage();
    }
    c.setBeverage(new Beer());
    c.setBeverage(new Beverage());
    c.setBeverage(new Object());

  }
}

class Beverage {

}

class Boricha extends Beverage{

}

class Beer extends Beverage{

}

class Cup{
  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}

