package classsExample;

public class Car {

  int speed=0;
  boolean direction = true; // 방향은 전진 또는 후진만 있다고 가정

  @Override
  public boolean equals(Object obj) {
    if (this == obj) { // 먼저, 같은 객체인지 확인
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) { // null이거나 다른 타입의 객체인지 확인
      return false;
    }

    Car car = (Car) obj; // 형변환

    // 이제 속성들을 비교합니다.
    return speed == car.speed && direction == car.direction;
  }

//  @Override
//  public int hashCode() {
//    int result = speed;
//    result = 31 * result + (direction ? 1 : 0); // 여기서 31은 임의의 소수입니다.
//    return result;
//  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setDirection(boolean direction) {
    this.direction = direction;
  }
}
