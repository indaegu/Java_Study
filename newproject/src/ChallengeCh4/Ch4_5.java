//23.08.16 (수) : chapter 4 확인 문제
// 중첩 for문을 이용하여 방정식 4x+5y = 60의 모든 해를 구해서(x,y) 형태로 출력하는 코드를 작성하시오, 단 x,y는 10이하 자연수
package ChallengeCh4;

public class Ch4_5 {
    public static void main(String[] args) {
        int y = 1;
        for (int x = 1; x <= 10; x++) {
            for (y = 1; y <= 10 ; y++) {
                if((4*x) + (5*y) == 60){
                    System.out.printf("(%d, %d)\n",x,y);
                }
            }
        }
    }
}
