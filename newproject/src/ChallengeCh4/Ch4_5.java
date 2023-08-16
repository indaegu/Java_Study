//23.08.16 (수) : chapter 4 확인 문제
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
