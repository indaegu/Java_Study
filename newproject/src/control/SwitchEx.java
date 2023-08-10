package control;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchEx {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input star Count (1~3) : ");
    int num = scanner.nextInt();
    switch(num){
      case 3 :
        System.out.print("***");
        break;
      case 2 :
        System.out.print("**");
        break;
      case 1 :
        System.out.print("*");
        break;
    }
  }
}
