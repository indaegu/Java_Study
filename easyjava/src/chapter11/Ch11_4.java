// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : 확인문제 4,5번(키보드로 입력한 정수값을 학생의 점수로 사용하며 ArrayList에 저장...)
package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        int score = 0;
        while (true){
            System.out.print("학생의 점수를 입력하세요(-1을 입력하여 종료) : ");
            score =scanner.nextInt();
            if(score >= 0){
                scores.add(score);
            }else{
                break;
            }
        }
        System.out.println("입력 받은 학생수는 : " + scores.size() + "명");
        System.out.println("입력 받은 성적은 : " +scores);

        //최고 점수 찾기
        int big =0;
        for (Integer integer : scores) {
            if (big <= integer) {
                big = integer;
            }
        }

        //최고 점수 기반 점수와 등급 출력하기
        int index = 0;
        for (int num : scores) {
            if((big-10)<=num){
                System.out.printf("%d번째 학생의 점수는 %d, 등급은 A\n",index+1,scores.get(index));
                index++;
            } else if ((big-10)>num && (big-20)<=num) {
                System.out.printf("%d번째 학생의 점수는 %d, 등급은 B\n",index+1,scores.get(index));
                index++;
            } else{
                System.out.printf("%d번째 학생의 점수는 %d, 등급은 C\n",index+1,scores.get(index));
                index++;
            }
        }
    }
}
