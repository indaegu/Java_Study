//23.08.16 (수) : 배열과 정수를 동시에 받아 메소드 오버로딩 없이 가변인자를 처리하는 실습
package chapter05;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        int arr[]={2,3};
        System.out.println(sum(1, arr));
        System.out.println(sum(1,2,3,4,5));
    }
    public static int sum(int x, int... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
