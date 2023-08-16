//23.08.16 (수) : chapter 4 확인 문제
// for문을 이용하여 반쪽짜리 피라미드 쌓기
package ChallengeCh4;

public class Ch4_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
