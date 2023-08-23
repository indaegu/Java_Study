// 23.08.23 (수) : 쉽게배우는자바 8장 확인문제 4번 Dice
package chapter08;

public class Dice {
  double num;

  public int roll(){
    num = Math.random() * 6;
    if(num <= 1 && num >=0){
      return 1;
    } else if (num <= 2 && num >1) {
      return 2;
    }else if (num <= 3 && num > 2) {
      return 3;
    }else if (num <= 4 && num >3) {
      return 4;
    }else if (num <= 5 && num >4) {
      return 5;
    }else if (num <= 6 && num >5) {
      return 6;
    }else
      return 0;
    }
  }

