package chapter08;

import java.util.Date;

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
    System.out.println(System.currentTimeMillis()/1000 + "초"); //1970년 부터 현재까지의 시간을 밀리초로 반환해줌, 현재는 Calrender 클래스로 대체됨
    System.out.println(new Date(System.currentTimeMillis()));

  }
}
