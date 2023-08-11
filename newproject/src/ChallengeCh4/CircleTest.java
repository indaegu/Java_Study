package ChallengeCh4;

public class CircleTest {
  public static void main(String[] args) {
    Circle circle1 = new Circle(5.0, "yello");
    Circle circle2 = new Circle(1.0, "red");
    Circle circle3 = new Circle(3.0, "RED");

    System.out.println(circle1.getNumOfCircles());
    System.out.println(circle1.getNumOfRedCircles());
  }
}
