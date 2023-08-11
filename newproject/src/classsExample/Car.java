package classsExample;

public class Car {

  int speed=0;
  boolean direction = true; // 방향은 전진 또는 후진만 있다고 가정

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setDirection(boolean direction) {
    this.direction = direction;
  }
}
