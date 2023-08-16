// 23.08.16 (수) foreach를 이용한 배열 활용 실습
package chapter05;
import java.util.Arrays;

public class ForEachEx {
    public static void main(String[] args) {
        int[] one2five = {0,1,2,3,4};
        int sum =0;
        for (int i = 0; i < one2five.length; i++) {
            one2five[i] ++;
        }
        System.out.println(Arrays.toString(one2five));
        for (int i :
                one2five) {
            sum += i;
        }
        System.out.println(Arrays.toString(one2five));
        System.out.println("sum : " + sum);
    }
}
