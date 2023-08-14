package chapter05;

import java.util.Scanner;

//5개의 과목 점수를 입력 받아 배열에 저장하고
// 해당 값들의 총합고 평균을 구하는 코드 작성
public class Array1Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];

        for (int i = 0; i < number.length; i++) {
            System.out.printf("값을 입력하세요(%d/%d) : ",i+1,number.length);
            number[i] = input.nextInt();
        }

        int sum =0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        float avg = sum / number.length;
        System.out.printf("%d개 입력값의 합은 : %d\n",number.length,sum );
        System.out.printf("%d개 입력값의 평균은 : %.1f",number.length,avg );
    }
}
