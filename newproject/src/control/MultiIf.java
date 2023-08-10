package control;

import java.util.Scanner;

public class MultiIf {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your score (0~100) : ");
    int score = scanner.nextInt();
    String grade;
    if (score >= 90 && score <= 100) {
      if (score >=95) {
        grade = "A+";
      } else {
        grade = "A";
      }
    } else if (score >= 80 && score < 90) {
      if (score >=85) {
        grade = "B+";
      } else {
        grade = "B";
      }
    } else if (score >= 70 && score < 80) {
      if (score>=75) {
        grade = "C+";
      } else{
        grade = "C";
      }
    } else if (score >= 60 && score < 70) {
      if(score >= 65) {
        grade = "D+";
      } else {
        grade = "D";
      }
    } else if(score < 60 && score >= 0) {
      grade = "F";
    } else {
      grade = "Input error";
    }
    System.out.println("your grade : " + grade);
  }
}
