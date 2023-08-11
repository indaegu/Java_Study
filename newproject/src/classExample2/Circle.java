package classExample2;

public class Circle {
  double radius;
  String color;

  public Circle(){
    this.radius = 1.0;
    this.color = "white";
  };
  public Circle(double radius){
    this.radius = radius;
    this.color = "white";
  }
  public Circle(String color){
    this.color = color;
    this.radius = 1.0;
  }
  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }

  void print(){
    System.out.println("반지름 : " + radius + " 색상 : " + color);
  }

}
