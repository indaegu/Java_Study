package classExample2;

import java.util.Scanner;

public class TriangleEx {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("밑변의 길이를 입력하시오 : ");
//    double width = scanner.nextDouble();
//    System.out.print("높이를 입력하시오 : ");
//    double height = scanner.nextDouble();

    Triangle t1 = new Triangle(10.0, 5.0);
    Triangle t2 = new Triangle(15.0, 5.0);
    Triangle t3 = new Triangle(10.0, 5.0);

    System.out.println("삼각형의 넓이는 : " + t1.findArea());
    System.out.println("같은가요? " + t1.isSameArea(t3));
  }
}

