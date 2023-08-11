package classsExample;
//상속의 예시
class Animal {
  private String name;
  void 숨쉰다(){
    System.out.println("숨쉰다");
  }
  void 먹는다(){
    System.out.println("먹는다");
  }
  void 움직인다(){
    System.out.println("움직인다");
  }

  @Override
  public String toString() {
    return "제 이름은 " + name + "입니다.";
  }
}

class Bird extends Animal{
  private String name ="Bird";
  void 헤엄친다(){
    System.out.println("헤엄친다");
  }

  @Override //어노테이션 : 메소드나 클래스, 필드 위에 붙이는 장식자? / 컴파일러에게 기존에 존재하는 메서드를 덮어쓰는것이라고 알려주는것
  void 움직인다() {
//    super.움직인다(); //super.움직인다 = 부모의 움직인다를 의미
    System.out.println("날아간다");
  }

  @Override
  public String toString() {
    System.out.println("제 이름은 " + name + "입니다.");
    return "제 이름은 " + name + "입니다. ";
  }
}

class Tiger extends Animal {
  private String name ="Tiger";
  @Override
  void 움직인다() {
//    super.움직인다();
    System.out.println("사냥한다");
  }

  void 달린다(){
    System.out.println("달린다");
  }
}

class Fish extends Animal{

  @Override
  void 움직인다() {
//    super.움직인다();
    System.out.println("헤엄친다");
  }
}
