//23.08.16 (수) : chapter 4 확인 문제
// while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을때 나오는 눈을(눈1,눈2) 형태로 출력하고, 눈의 합이 5가 아니면
// 계속 주사위를 던지고 눈의 합이 5이면 실행을 멈추는 코드를 작성하시오
package ChallengeCh4;

public class Ch4_4 {
    public static void main(String[] args) {
        while (true){
            int dice1 = (int) Math.ceil((Math.random()*6));
            int dice2 = (int) Math.ceil((Math.random()*6));
            if((dice1 + dice2) != 5){
                System.out.println("첫번째 주사위 값 : " + dice1  + " 두번째 주사위 값 : " + dice2 );
            } else if (dice1 + dice2 == 5) {
                break;
            }
        }
    }
}
