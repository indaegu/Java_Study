// 23.08.17 (목) : 다형성 실습
package chapter06;

public class TypeDownCasting {
  public static void main(String[] args) {
//    Student s = (Student) new Person(); //UpCasting으론 자동형변환이 가능하지만 DownCasting은 명시적으로 해줘야함
//    //그러나 이대로 코드를 실행하면 ClassCastException 발생함 / 결과 : chapter06.Person cannot be cast to class chapter06.Student
//    s.whoAmI();
//    s.work();
    Student s = new Student();
    Person p = new Person();

    //instanceof 연산자는 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드이다. 맞으면 true 아니면 false를 반환한다.
    System.out.println("s instanceof Student ? " + (s instanceof Student));
    System.out.println("s instanceof Person ? " + (s instanceof Person));
    System.out.println("p instanceof Student ? " + (p instanceof Student)); // 자식 메서드의 인스턴스 형이 아님
    System.out.println("p instanceof Object ? " + (p instanceof Object));
    downCast(p); // 자기 자신을 넘김
    downCast(s); // 자동형변환 되어 넘김
  }
  static void downCast(Person p){
    if(p instanceof Student == true){
      Student s = (Student) p;
      s.work();
      s.whoAmI();
    }

  }

//  static void downCast(Student p){ //만약 형변환이 안된다면 이렇게 계속 만들어줘야함
//
//  }
}
