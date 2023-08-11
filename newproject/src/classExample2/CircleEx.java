package classExample2;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle(12.0, "red");
    Circle circle1 = new Circle("red");
    Circle circle2 = new Circle(12.0);
    Circle circle3 = new Circle();
    circle.print();
    circle1.print();
    circle2.print();
    circle3.print();

  }


}
