package chapter08;

public class PersonTest {
  public static void main(String[] args) {
    Person person1 = new Person("홍길동",11111);
    Person person2 = new Person("황진이",11111);

    if(person1.equals(person2)){
      System.out.println("같은 사람이다.");
    }else {
      System.out.println("다른 사람이다.");
    }
  }
}
