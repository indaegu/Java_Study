package sample;

public class InputOutput {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in); // Scanner를 사용하기 위해 새로운 객체를 선언해옴
//    int input1 = scanner.nextInt();
//    int input2 = scanner.nextInt();
//    System.out.printf("처음 입력 받은 값은 = %d\n두번째 입력 받은 값은 = %d\n둘의 합은 = %d",input1, input2, input2 + input1);

//    String s = scanner.nextLine(); //문자열로 입력 받고
//    int i2 = Integer.parseInt(s); //int로 변환
//    System.out.println(i2);
    int a = 1_000_000;
    int b = 2_000_000;
    long c = a * (long) b ;
    System.out.println(c);

    double res = 5 /0.0;
    double r = 5 % 0.0;
    boolean b1 =Double.isInfinite(res);
    boolean b2 =Double.isNaN(r);

    System.out.println("res = " + (res + 2)); // res= Infinity
    System.out.println("(r + 2) = " + (r + 2)); // (r+2) = NaN
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);


  }
}
