//23.08.16 (수) : 매개변수로 입력 받은 Array의 element를 1씩 증가시키는 메서드 실습
package chapter05;

import java.util.Arrays;

public class IncrementEx {
    public static void main(String[] args) {
        for (String arg :
                args) {
            System.out.println(arg);
        }

        int[] x = {1,2,3};
        increment(x);
    }

    public static void increment(int[] n){
        for (int i = 0; i < n.length; i++) {
            n[i] += 1;
        }
        System.out.println(Arrays.toString(n));
    }

}
