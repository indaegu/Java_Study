package sample;

public class OperatorEx {
  public static void main(String[] args) {
    int i = 0;
    int j = i++; //후위 연산자 이기 때문에 증가전 값을 대입하고 다음 k를 선언할때 값이 1이 증가한 형태
    int k = ++i;
    System.out.printf("i = %d\nj = %d\nk = %d", i, j, k);
  }
}
