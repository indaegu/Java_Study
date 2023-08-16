//23.08.16 (수) : 가변인자를 활용하여 매개변수들의 합을 구하는 실습
package chapter05;

public class VarArgsEx {
    public static void main(String[] args) {
        int[] numbers = {1,23,4,5,6,7};
        printSum(1,2,3);
        printSum(2,3,6);

    }
    static void printSum(int ... numbers){
    int sum =0;
        for (int num :
                numbers) {
            sum +=num;
        } System.out.println(sum);
    }
}
