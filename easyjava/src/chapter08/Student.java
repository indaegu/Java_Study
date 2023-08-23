// 23.08.23 (수) : 쉽게배우는자바 8장 확인문제 2번 (toString Overloading)

package chapter08;

public class Student {
  String name;

  public Student(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "학생["+ name + "]";
  }
}
