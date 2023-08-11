package classExample2;

import java.util.Scanner;

public class UserEx {
  public static void main(String[] args) {
  User user = new User("성이름", "qwe123", "qwe123", 20);
  user.print();
  Scanner scanner = new Scanner(System.in);
  System.out.print("변경할 나이를 입력하세요 : ");
  while (true){
    int age = scanner.nextInt();
    if(age>=0 && age<=120){
      user.setAge(age);
      break;
    } else
      System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요");
  }
  System.out.print("변경할 이름를 입력하세요 : ");
  String name = scanner.next();
  user.setName(name);
  user.print();
  }
}
