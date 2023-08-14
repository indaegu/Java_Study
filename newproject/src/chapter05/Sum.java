package chapter05;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        int arr[]={2,3};
        System.out.println(sum(1, arr));
        System.out.println(sum(1,2,3,4,5));
    }
    public static int sum(int x, int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int sum(int ... num){
        int sum = 0;
        for (int i = 1; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

}
