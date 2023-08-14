package chapter05;

import classsExample.Car; //auto import

public class String2CompareEx {
    public static void main(String[] args) {
        String s1 = "HI, JAVA";
        String s2 = "hi, java";

        Car c1 = new Car(); //Speed = 0 , direction = true로 가지고 있는 클래스
        Car c2 = new Car();

        System.out.println("s1,s2 리터럴 equals로 비교 결과 : " + s1.equals(s2)); // 출력결과 : false
        System.out.println("s1,s2 리터럴 equalsIgnoreCase로 비교 결과 : " + s1.equalsIgnoreCase(s2)); // 출력결과 : true
        System.out.println("s1,s2 리터럴 compareTo로 비교 결과 : " + s1.compareTo(s2)); // 출력결과 : -32
        System.out.println("s1,s2 리터럴 compareToIgnoreCase로 비교 결과 : " + s1.compareToIgnoreCase(s2)); // 출력결과 : 0

        System.out.println("c1, c2의 ==으로 비교 결과(두 객체의 참조 주소를 비교한 결과) : " + (c1==c2)); //
        
        //Car class에서 equals를 Override 하지 않으면 false를 반환함
        System.out.println("c1, c2의 equals로 비교 결과(두 객체의 내용 자체를 비교한 결과) : " + c1.equals(c2));



    }
}
