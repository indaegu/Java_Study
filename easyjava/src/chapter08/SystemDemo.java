package chapter08;

public class SystemDemo {
  public static void main(String[] args) {
    int[] numbers = new int [10000000];
    long beforeTime = System.currentTimeMillis();
    System.out.println(System.currentTimeMillis());
    for (int i = 1; i < 10000000; i++) {
      numbers[i] = i;
    }
    long afterTime = System.currentTimeMillis();
    System.out.println((double)(afterTime-beforeTime)/1000 + "초");

  }
}
