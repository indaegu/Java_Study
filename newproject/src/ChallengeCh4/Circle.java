package ChallengeCh4;

public class Circle {
  //static(정적)변수
  private static long numOfCircles;
  private static long numOfRedCircles;

  //instance(동적)변수
  private double radius;
  private String color;

  //생성자

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    numOfCircles++;
    if(color.equalsIgnoreCase("red")){//대소문자 구분없이 비교할수 있는 함수 ex) RED = red = Red
      numOfRedCircles++;
    }

  }

  public static long getNumOfCircles() {
    return numOfCircles;
  }

  public static long getNumOfRedCircles() {
    return numOfRedCircles;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
