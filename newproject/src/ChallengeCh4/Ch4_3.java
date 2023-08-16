//23.08.16 (수) : chapter 4 확인 문제
// for문을 이용해서 1부터100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성하라
package ChallengeCh4;

public class Ch4_3 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i <+ 100; i++) {
            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
