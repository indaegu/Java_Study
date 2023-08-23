// 23.08.23 (수) : 쉽게배우는자바바 8장 util 클래스 실습
package chapter08;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now);

    Calendar c = Calendar.getInstance();
    System.out.println(c);
    System.out.printf("오늘은 %d년 %d월 %d일 %d시 %d분 입니다 \n"
        ,c.get(Calendar.YEAR)
        ,c.get(Calendar.MONTH)+1
        ,c.get(Calendar.DATE)
        ,c.get(Calendar.HOUR)
        ,c.get(Calendar.MINUTE)
    );
    System.out.println(c.getFirstDayOfWeek());
  }
}
