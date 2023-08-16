//23.08.16 (수) : 배열의 최소값, 최대값 찾기
package chapter05;

import java.util.Arrays;

public class ArrayMaxFind {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2};
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<=min){
                min = arr[i];
            }
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
        System.out.println(Arrays.toString(arr)); //정렬 전
        Arrays.sort(arr); // 오름차순으로 정렬
        System.out.println(Arrays.toString(arr)); //정렬된 배열이 출력됨
        System.out.println("max : " + arr[arr.length-1]); // 마지막 배열 값을 출려가면 최대값을 얻는것과 동일한 효과
    }
}
