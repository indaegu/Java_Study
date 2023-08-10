package method;

//import static method.Method2Ex.add; //static 선언

public class Method3Ex { //public method와 main은 하나만 있어야한다
  public static void main(String[] args) {
    // 객체를 만들어서 변수에 넣어야지만 다른 클래스에서 사용가능
    // 단 static 선언을 하면 바로 사용 가능
    MyMath myMath = new MyMath();
    long res1 = myMath.add(100L, 200L);
    double res2 = myMath.div(100,0);
    System.out.println(res1);
    System.out.println(res2);
  }
}

class MyMath {
  long add(long num1, long num2){
    return num1 + num2;
  }

  double div (double num1, double num2){
    if(num2 ==0){
      System.out.println("0으로 나눌수 없습니다. ");
      return 0;
    } else {
      return num1 / num2;
    }
  }
}
