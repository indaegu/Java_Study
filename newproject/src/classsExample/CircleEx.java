package classsExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.0);
    System.out.println(circle.getRadius()); // 그냥 circle로만 입력하면 객체가 저장된 주소가 출력됨 ex) classsExample.Circle@3b07d329
  }
}

class Circle { //캡슐화 과정
  private double radius =0.0;

  public Circle(double radius) { //매개변수를 받을 수 있는 생성자
    this.radius = radius;
  }

  public Circle() { // 기본 생성자
  }

  public double getRadius() { //getter
    return radius;
  }

  public void setRadius(double radius) { //setter
    this.radius = radius;
  }
}
