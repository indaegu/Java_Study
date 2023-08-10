package control;

import java.util.Scanner;

public class WhileEx {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String kind,bio = ""; // 초기화를 진행하지 않으면 예기치 못한 출력에 대비가 안되서 오류가 남

    while (true){
      System.out.print("동물의 종류를 입력하세요(종료를 원하면 종료를 입력하세요) : ");
      bio = scanner.nextLine();
      if(bio.equals("종료")){
        System.out.println("프로그램을 종료합니다.");
        break;
      } else {
        if (bio.equals("호랑이") || bio.equals("사자")){ //문자열은 객체이기 때문에 equals로 비교해야함
          kind ="포유류";
        } else if (bio.equals("참새") || bio.equals("독수리")) {
          kind ="조류";
        } else {
          kind = "해당없는 동물";
        }
        System.out.printf("%s는 %s입니다. \n",bio, kind);
      }
    }
  }
}
