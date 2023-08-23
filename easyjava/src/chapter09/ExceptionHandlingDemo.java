// 23.08.23 (수) : 쉽게배우는자바 9장, 예외처리 및 제네릭 : 예외 떠넘기기 실습
package chapter09;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    InputStream is = new InputStream() {
      @Override
      public int read() throws IOException {
        return 0;
      }
    };
    BufferedInputStream bis = new BufferedInputStream(is);
    System.out.println(bis);
    int i = 0;
    String s = null;
    try { // "Ctrl + Alt + t" 명령어를 통해 try,catch 구문을 자동으로 생성해줌
      System.out.println(s.length()); // null을 참조하려고 함, 먼저 에러가 발생하면 아래 문장은 실행되지 않고 두 번째 catch로 이동
      int res = 10/i;
      System.out.println(res);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌수 없습니다!");
    } catch (NullPointerException e){
      System.out.println("Null 값을 참조할 수 없습니다!");
    } catch (Exception e){
      System.out.println("알 수 없는 에러가 발생했습니다.");
    } finally { // catch문이 실행되더라도 finally는 항상 실행된다.
      System.out.println("프로그램을 종료합니다.");
    }
  }
}
