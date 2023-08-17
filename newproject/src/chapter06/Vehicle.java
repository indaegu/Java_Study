// 23.08.17 (목) : 다형성 실습
package chapter06;

public class Vehicle {
  String name = "Vehicle";

  void whoAmI(){
    System.out.println("Vehicle에서 실행된 whoAmI");
  }
   void move(){
    System.out.println("Vehicle에서 실행된 move");
  }
}
class Car extends Vehicle{
  String name ="Car";

  @Override
  void whoAmI() { //Ctrl + o 로 생성된 Override
    System.out.println("Car에서 실행된 whoAmI");
  }
  void move(){
    System.out.println("Car에서 실행된 move");
  }

}

class SportsCar extends Car{
  @Override
  void whoAmI() {
    System.out.println("SporstCar에서 실행된 whoAmI");
  }

  @Override
  void move() {
    System.out.println("SporstCar에서 실행된 move");
  }
}
