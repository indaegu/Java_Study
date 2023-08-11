package classExample2;

public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("민국");
    p.setAge(21);
    p.sayHello();

   p.setName("민국").setAge(21).sayHello(); //메서드 반환형을 this로 바꿨기 때문에 이런 형태가 가능
  }
}
