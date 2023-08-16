//23.08.16 (수) : Enum을 이용하여 등급을 설정하고 학생의 점수를 입력 받은뒤 등급을 출력하는 실습
package chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class EnumScoreTest  {
    public static void main(String[] args) {
        int numOfStudents = 0;
        EnumGrade grade;
        Scanner in = new Scanner(System.in);
        System.out.print("입력 받을 학생 수를 입력하세요 : ");
        numOfStudents = in.nextInt(); // 입력받을 학생의 수를 입력
        int[] scores = new int[numOfStudents]; // 해당 크기만큼 배열 생성
        for (int i = 0; i < numOfStudents; i++) { //학생의 수만큼 입력 받음
            System.out.printf("%d번째 학생의 점수를 입력하세요 : ",i+1);
            scores[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(scores)); // 입력받은 배열을 출력
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>=90){
                grade = EnumGrade.A;
            }else if(scores[i]>=80 && scores[i]<90){
                grade = EnumGrade.B;
            }else {
                grade = EnumGrade.C;
            }
            System.out.printf("%d번째 학생의 점수는 %d, 등급은 %s(%s) 입니다.\n",i+1, scores[i],grade,grade.getEnumGrade());
        }
    }
}
