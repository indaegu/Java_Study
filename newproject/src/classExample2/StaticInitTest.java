package classExample2;

public class StaticInitTest {
  public static void main(String[] args) {
    System.out.println(StaticInit.sumOneToTen); 
  }
  
}
class StaticInit{ //반복문으로 정적 변수를 할당하는 방법
  static int sumOneToTen;
  static { //초기화 블럭 이라고 부름
    int sum = 0;
    for(int i =1; i<=10;i++){
      sum += i;
    }
    sumOneToTen = sum;
  }
}