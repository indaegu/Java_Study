//23.08.16 (수) : chapter 4 확인 문제
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
