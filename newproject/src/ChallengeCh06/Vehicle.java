// 23.08.17 (목) : 다형성 실습
package ChallengeCh06;

public class Vehicle {
  String color; // 자동차 색상
  int speed; // 자동차 속도

  public Vehicle(String color, int speed){
  this.color =color;
  this.speed =speed;
  }
  void show(){
    System.out.println("Vehicle에서 실행된 show" + this.color + this.speed);
  }
}

class Car extends Vehicle{
  int displacement;
  int gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }

  @Override
  void show() {
    System.out.println("Car에서 실행된 show : " + this.color + " " + this.speed + " " + this. displacement + " "+ this.gears);
  }
}
