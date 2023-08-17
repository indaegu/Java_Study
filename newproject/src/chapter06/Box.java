// 23.08.17 (목) : final method 실습
package chapter06;

public class Box {
  String name;
  public Box(String name){
    this.name = name;
  }
}
class ColoerdBox extends Box{

  public ColoerdBox(String name) {
    super(name);
  }
}
