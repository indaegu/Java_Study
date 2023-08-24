// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : 확인문제 1번(ArrayList를 선언하고 원소 문자열의 길이가 2인 동물만 출력하기)
package chapter11;

import java.util.ArrayList;

public class Ch11_1 {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("나비");
        animal.add("다람쥐");
        animal.add("라마");

        for (String ani : animal) {
            if (ani.length() == 2){
                System.out.println(ani);
            }
        }
    }
}
