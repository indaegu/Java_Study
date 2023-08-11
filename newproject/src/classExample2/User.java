package classExample2;

public class User {
  private String name;
  private String id;
  private String password;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public User(String name, String id, String password, int age) {
    this.name = name;
    this.id = id;
    this.password = password;
    if(age>=0 && age<=120){
      this.age = age;
    } else {
     System.out.println("올바르지 않은 나이값 입니다.");
    }
  }

  public void setAge(int age) {
    if(age>=0 && age<=120){
      this.age = age;
    }else {
      System.out.println("올바르지 않은 나이값 입니다.");
    }

  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
  public void print(){
    System.out.println("Name : " + name + ", ID : " + id + ", PASSWORD : " + password + ", AGE : " + age);
  }
}
