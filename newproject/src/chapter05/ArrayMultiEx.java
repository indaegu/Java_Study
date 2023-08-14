package chapter05;

import java.util.Arrays;

public class ArrayMultiEx {
    public static void main(String[] args) {
//        int[][] scores = new int[3][5]; // 다차원 배열의 크기만 선언
        int[][] scores = {{90,100,80,70,60}, {70,100,90,70,60}, {80,100,80,70,60}}; // 다차원 배열 초기화와 동시에 값 삽입
        int[] sums = new int[3]; // 학생 별 합을 더할 배열 선언
        int[] avg = new int[3];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sums[i] += scores[i][j];
            }
            System.out.println(Arrays.toString(sums));
            avg[i]= sums[i] / scores[i].length;
            System.out.println(Arrays.toString(avg));
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번째 학생의 점수의 합 : %d \n", i+1, sums[i]);
            System.out.printf("%d번째 학생의 점수의 평균 : %d \n\n", i+1, avg[i]);
        }
    }
}
