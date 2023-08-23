// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭 : 예외 떠넘기기 실습

package chapter09;

import java.io.IOException;

public class ThrowExceptionDemo {
  public static void main(String[] args) throws IOException, InterruptedException {
    write("a.txt");
  }

  static void write(String filename) throws IOException,InterruptedException { //예외 던지기, 처리하는곳에서 처리하게 만듦
    System.out.println(filename + "파일을 저장합니다");
  }

}
