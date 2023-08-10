package method;

public class MethodOverloading {
  public static void main(String[] args) {
    int res = sum(1,2);
    int res1 = sum(1,2,3);
    long res2 = sum(1L,2L,3L);

    System.out.println(res);
    System.out.println(res1);
    System.out.println(res2);
  }
  static int sum(int i, int j) {
    return i + j;
  }
  static int sum(int i, int j, int k){ //메소드 오버로딩하여 시그니처중 매개변수를 바꾼 경우
    return i + j + k;
  }
  static long sum(long l, long j, long k){//메소드 오버로딩하여 타입과 매개변수를 바꾼 경우 단, 타입만 바꾼다고 오버로딩이 아님
    return l + j + k;
  }
}
