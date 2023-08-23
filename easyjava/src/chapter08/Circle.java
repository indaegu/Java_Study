package chapter08;

public class Circle {
  int s;

  public Circle(int s) {
    this.s = s;
  }
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Circle circle){
      if(circle != null && this.s == circle.s)
        return true;
      else {
        return false;
      }
    } else
      return  false;
  }
}
