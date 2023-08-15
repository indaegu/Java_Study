package chapter05;

import java.util.Scanner; //자동 임포트

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int mok =0;
        int[] numbers = new int[10];
        for (int i = 0; i < 3; i++) {
            System.out.printf("숫자 입력 (%d/%d):",i+1,3);
            num = scanner.nextInt();
            mok  = num / 10;
            if(num>0 && num <100){
                numbers[mok]++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d 에서 %d : ", i*10, i*10 + 9);
            for(int j=0; j<numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
