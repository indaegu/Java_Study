package chapter05;

import java.util.Arrays;

public class Array2Ex {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int element: arr) {
            System.out.println(element);
        }
        System.out.println(arr); //출력결과 : [I@4eec7777 => 주소값이 출력된다, 앞에 "["는 배열이라는 의미
        System.out.println(Arrays.toString(arr)); //Java에서 Arrays에 포함된 메서드인 toString으로 배열 출력하는 방법

        char[] cArr = {'A', 'B', 'C'};

        //일일이 출력하는 방법
        for (int elements: cArr) {
            System.out.println(elements);
        }
        System.out.println(cArr); //출력결과 : ABC => 기존과 다르게 주소가 아니라 ABC로 나온 이유는 문자를 여러개 출력하는건 문자열을 출력하는것과 동일 하기 때문
        System.out.println(Arrays.toString(cArr)); //Java에서 Arrays에 포함된 메서드인 toString으로 배열 출력하는 방법


    }
}
