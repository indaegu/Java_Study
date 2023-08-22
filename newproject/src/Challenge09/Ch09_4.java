//23.08.22 (화) : 이것이 자바다. 확인문제 9장 4번
package Challenge09;

public class Ch09_4 {
  public static void main(String[] args) {
    Car myCar =new Car();
    Car.Tire tire = myCar.new Tire();
    Car.Engine engine = new Car.Engine();
  }
}
