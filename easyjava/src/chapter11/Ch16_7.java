// 23.08.25 (금) : 이것이 자바다 16장 (Lambda) : 확인문제 7번
//7. 다음은 배열 항목 중에 최대값 또는 최소값을 찾는 코드입니다. maxOrMin() 메소드를 호출할때 빈 곳에 람다식을 작성해보세요.
package chapter11;

public class Ch16_7 {
  private static int[] scores = {10, 50, 3,60,80};

  public static int maxOrMin(Operator operator) {
    int result = scores[0];
    for (int score : scores) {
      result = operator.apply(result, score);
    }
    return result;
  }

  public static void main(String[] args) {
    int max = maxOrMin((x,y) -> x>=y ? x:y);
    System.out.println("최대값은 : " + max);

    int min = maxOrMin((x,y) -> x>=y ? y:x);
    System.out.println("최소값은 : " + min);
  }

}
@FunctionalInterface
interface Operator {
  public int apply(int x, int y);
}
