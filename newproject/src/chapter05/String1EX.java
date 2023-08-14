package chapter05;

public class String1EX {
    public static void main(String[] args) {
        String s1 = new String("안녕, 자바!"); // Ctrl + shift + Enter 누르면 자동으로 세미콜론 자동완성 가능
        String s2 = new String("안녕, 자바!");
        int i1 = 10;
        int i2 = 10;
        System.out.println("두 정수형은 같은가? : " + (i1 == i2)); // 출력결과 : true
        System.out.println("생성 직후  s1과 s2의 주소는 같은가? : " + (s1 == s2)); //출력결과 : false
        s1 = s2;
        System.out.println("할당 후 s1과 s2의 주소는 같은가? : " + (s1 == s2)); // 출력결과 : ture
        System.out.println("두 String의 리터럴은 같은가? : " + s1.equals(s2)); //출력결과 : ture
    }
}
