// 23.08.23 (수) : 쉽게배우는자바바 8장 util 클래스 실습, SimpleDateFormat
package chapter08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(sdf.format(date));
}
}
