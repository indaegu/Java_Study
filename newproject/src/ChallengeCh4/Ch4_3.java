//23.08.16 (수) : chapter 4 확인 문제
package ChallengeCh4;

public class Ch4_3 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i < 100; i++) {
            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
