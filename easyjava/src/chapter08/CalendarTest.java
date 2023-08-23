// 23.08.23 (수) : 쉽게배우는자바 8장 확인문제 3번 Calendar, 날짜

package chapter08;

import chapter09.Box;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
  public static void main(String[] args) {
    String[] weekName = {"월","화","수","목","금","토","일"};
    String[] noonName = {"오전","오후"};
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month =c.get(Calendar.MONTH)+ 1;
    int day = c.get(Calendar.DATE);
    int week1 = c.get(Calendar.DAY_OF_WEEK);
    String week;
    switch (week1){
      case 0 -> week = weekName[5];
      case 1 -> week = weekName[6];
      case 2 -> week = weekName[0];
      case 3 -> week = weekName[1];
      case 4 -> week = weekName[2];
      case 5 -> week = weekName[3];
      case 6 -> week = weekName[4];
      default -> week = "ERROR";
    }
    int noon1 = c.get(Calendar.AM);
    String noon;
    if(noon1 >= 1){
      noon = noonName[1];
    }else{
      noon = noonName[0];
    }
    int hour = c.get(Calendar.HOUR);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println(year + "년 " + month + "월 " + day +"일");
    System.out.println(week + "요일 " + noon);
    System.out.println(hour + "시 " + minute + "분 " + second +"초");

  }
}
