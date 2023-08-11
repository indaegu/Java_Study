package classExample2;

public class Triangle {
  private double width;
  private double height;

  public Triangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getwidth() {
    return width;
  }

  public void setwidth(double width) {
    if(width<=0){
      System.out.println("올바르지 않은 width");
    } else{
      this.width = width;
    }
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if(height<=0){
      System.out.println("올바르지 않은 height");
    }else
    this.height = height;
  }

  public double findArea(){
      return width * height / 2;
  }

  public boolean isSameArea(Triangle area) {
    return area.findArea() == this.findArea();// area : 매개변수로 넘겨받은 객체, this : 해당 메서드를 호출한 객체
  }
}