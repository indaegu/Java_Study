package classsExample;

public class LocalVarEx {
  public int PhoneCount;

  public static void main(String[] args) {
    int i = 0;
    double b = 0; // 지역 변수는 항상 초기화 해줘야한다.
    System.out.println(i);
    System.out.println(b);

    for(int j = 0; j<10;j++){ // 반복문안에 위치한 변수도 지역 변수로서, 항상 초기화 해줘야한다.
      int c = 1; // 반복분 블럭안에서 선언된 c는 외부 블럭에서 사용할 수 없다.
      System.out.println(c);
      System.out.println(i);
    }

//    System.out.println(c); // 반복분 블럭안에서 선언된 c는 외부 블럭에서 사용할 수 없다.
  }
}

