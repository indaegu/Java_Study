// 23.08.16 (수): 동적배열로 점수를 입력받고 입력값들의 합과 평균을 출력하기
package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

//5개의 과목 점수를 입력 받아 배열에 저장하고
// 해당 값들의 총합고 평균을 구하는 코드 작성
public class Array2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int inputScores = 0;

        while (true){
            System.out.printf("점수를 입력하세요(-1을 입력하면 종료 ) : ");
            inputScores =input.nextInt();
            if(inputScores == -1){
                break;
            }
            number.add(inputScores);
        }

        int sum =0;
        for (int j = 0; j < number.size(); j++) {
            sum += number.get(j);
        }

        if(number.size() >= 1){
            float avg = sum / number.size();
            System.out.printf("%d개 점수의 평균은 : %.1f\n",number.size(),avg );
        } else{
            float avg = 0;
            System.out.printf("%d점 입력값의 평균은 : %.1f\n",number.size(),avg );
        }
        System.out.printf("%d개 점수의 합은 : %d\n",number.size(),sum );

    }
}
