package method;

public class Method2Ex {
  public static void main(String[] args) {
    long res1 = add(1L,2L);
    double res2 = div(13,0);
    System.out.println("덧셈 결과 : " + res1);
    System.out.println("나눗셈 결과 : " + res2);

  }

  static long add(long num1, long num2){
    return num1 + num2;
  }

  static double div (double num1, double num2){
    if(num2 ==0){
      System.out.println("0으로 나눌수 없습니다. ");
      return 0L;
    } else {
      return num1 / num2;
    }
  }

}
