package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //if문
    System.out.print("if 문 = 동물의 종류를 입력하세요 : ");
    String bio = scanner.nextLine();
    String kind = ""; // 초기화를 진행하지 않으면 예기치 못한 출력에 대비가 안되서 오류가 남
    if (bio.equals("호랑이")|| bio.equals("사자")){ //문자열은 객체이기 때문에 equals로 비교해야함
      kind ="포유류";
    } else if (bio.equals("참새")|| bio.equals("독수리")) {
      kind ="조류";
    } else{
      kind = "해당없는 동물";
    }
    System.out.printf("if 문에서 출력된 %s는 %s 입니다\n",bio, kind);

    //switch문
    System.out.print("switch 문 = 비교할 동물의 종류를 입력하세요 : ");
    bio = scanner.nextLine();
    switch (bio){
      case "호랑이" : //상수(ONE), 리터럴(1)은 가능함 / 실수(1.0), 변수(num)는 불가능
      case "사자" :
        kind = "포유류";
        break;
      case "참새" :
      case "독수리" :
        kind = "조류";
        break;
      default:
        kind ="해당없는 동물";
    }
    System.out.printf("switch 문 = 출력된 %s는 %s 입니다\n",bio, kind);

    switch (bio){ //개선된 switch 문은 break 문을 사용할 수 없다
      case "호랑이", "사자"  -> kind = "포유류";
      case "참새", "독수리" -> kind = "조류";
      default -> kind ="해당 없는 동물";
    }
    System.out.printf("개선된 switch 문 = 출력된 %s는 %s 입니다",bio, kind);
  }
}
