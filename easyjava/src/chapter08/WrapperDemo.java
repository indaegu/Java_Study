package chapter08;

public class WrapperDemo {
  public static void main(String[] args) {
    Integer bi = Integer.valueOf(10);
    System.out.println(bi);
    bi = 20;
    System.out.println(bi);
    float v = Float.parseFloat("3.14");
    System.out.println(v);

//    int i = Integer.parseInt("3.14"); // 컴파일에선 에러가 안나고 실행시 오류발생
    int i = Integer.parseInt("3");
    System.out.println(v);

  }
}
