// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : 스트림 소개

package chapter12;

public class Util {
  public static <T> void print(T t) {
    System.out.print(t + " ");
  }
  public static <T> void printWithParenthesis(T t) {
    System.out.print("(" + t + ") ");
  }
}