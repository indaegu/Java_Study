package method;

public class IncrementEx {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("메서드 호출 전 x = " + x); //출력결과 : 0
    increment(x);
    System.out.println("메서드 호출 후 x = " + x); //출력결과 : 0
  }

  static void increment(int num){
    System.out.println("메서드 시작 전 num = " + num); //출력결과 : 0
    num++;
    System.out.println("메서드 시작 후 num = " + num);// 출력결과 : 1 
  } // 출력이 이렇게 나오는 이유 : increment class는 x값을 복사해서 값을 1을 증가시켰기 때문
}
