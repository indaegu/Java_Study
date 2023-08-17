// 23.08.17 (목) : 다형성 실습
package chapter06;

import java.util.Arrays;

public class CarClassTestEx {
  public static void main(String[] args) {
    Vehicle v = new Car(); //자동 UpCasting 가능
    System.out.println(v.name); // 실행결과 : Vehicle / Vehicle에 있는 필드가 출력됨
    v.whoAmI(); // 실행결과 : Car에서 실행된 whoAmI / Override 된 결과가 나옴 => 메서드는 Override된 결과가 출력된다
    v.move(); // 실행결과 : Car에서 실행된 move / Override 된 결과가 나옴 => 메서드는 Override된 결과가 출력된다

    Vehicle v1 = new Vehicle();
    v1.whoAmI();

    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = v1; //본인을 넣음
    vehicles[1] = new Car(); //Upcasting 해서 할당
    vehicles[2] = new SportsCar(); //Upcasting해서 할당

    for (Vehicle vehicle1 :
        vehicles) {
      vehicle1.whoAmI();
    }

  }
}