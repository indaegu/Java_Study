// 23.08.23 (수) : 쉽게배우는자바 8장 확인문제 1번 응용
package chapter08;

public class Person {
  String name;
  int num;

  public Person(String name, int num) {
    this.name = name;
    this.num = num;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person person){
      if(person != null && this.num == person.num){
        return true;
      }else {
        return false;
      }
    }else{
      return false;
    }
  }
}
