package chapter08;

public class GarbageDemo {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      Garbage garbage =new Garbage(i);
      System.gc();
    }


  }
}

class Garbage{
  int number;

  public Garbage(int number) {
    this.number = number;
    System.out.printf("Garbage (%d) 가 생성됨 \n", number);
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.printf("Garbage (%d) 가 수거됨 \n", number);
  }
}
