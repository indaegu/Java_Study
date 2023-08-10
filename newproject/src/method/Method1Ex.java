package method;

public class Method1Ex {
  public static void main(String[] args) {
    System.out.println(sum(0L, 10L));
    System.out.println(sum(10L, 100L));
    System.out.println(sum(100L, 1000L));
  }

  static long sum(long start, long end){
    long sum =0;
    for(long i = start; i <= end; i++){
      sum += i;
    }
    return sum;
  }

}
