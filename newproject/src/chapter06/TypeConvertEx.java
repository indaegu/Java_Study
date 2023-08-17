// 23.08.17 (목) : 다형성 실습
package chapter06;

public class TypeConvertEx {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = new Student();
//
//    String name = s.name;
//    int number = s.number;
//    s.work();
//    s.whoAmI();
//
//    name = p.name;
//    p.whoAmI();
    Person p;
    Student s = new Student();
    p = s; // p.을 해서 사용가능한 메서드를 살펴보면 여전히 Person은 Person에 있는 필드와 메서드만 보인다.
    // 자식 메서드를 가르킬순(자동형변환) 있지만 자식 메서드의 기능을 사용할수 없다.
    // 이로써 미래에 만들 상속을 미리 만들어 둘 필요가 없다는 장점이 있다.
    String name = p.name;
    p.whoAmI();

    Worker w = new Worker();
    p = w; // 부모 메서드는 새로이 만들어진 Worker 클래스를 가르킬순 있다. 물론 여전히 본인의 필드와 메서드만 사용가능

    //s = w; // 그러나 형제관계라고 볼수 있는 관계는 서로를 가르킬수 없다.



    Object o = new Person();
    o = s; // 조상 메서드는 모든 메서드를 가르킬수 있다.
    o =s;
    o =p;
    Person p1 =new Student();
    p1 = s;



  }
}
