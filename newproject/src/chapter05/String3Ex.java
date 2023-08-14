package chapter05;


public class String3Ex {
    public static void main(String[] args) {
        String s1 = "Hi, Java";
        String s2 = "!!!";
        System.out.println("s1.charAt(4) 결과 : " + s1.charAt(4)); // s1에서 4번째 index에 해당하는 문자를 가지고 오는 함수(띄어쓰기도 index에 포함)
        System.out.println("s1.concat(s2) 결과 : " + s1.concat(s2)); // 두 문자열을 이어 붙이는 함수

        String s3 = " ";
        String s4 = "";
        System.out.println("s3.isEmpty() 결과 : " + s3.isEmpty()); // 공백도 문자가 있다고 판단하여 비어있지 않은걸로 출력
        System.out.println("s4.isEmpty() 결과 : " + s4.isEmpty());
        System.out.println("s3.isBlank() 결과 : " + s3.isBlank());
        System.out.println("s4.isBlank() 결과 : " + s4.isBlank());
        System.out.println(s1.toLowerCase()); // 모두 소문자로 출력
        System.out.println(s1.toUpperCase()); // 모두 대문자로 출력
        System.out.println(s1); // 그냥 출력

        System.out.println(s1.substring(4)); // beginIndex부터 끝까지 출력
        System.out.println(s1.substring(4,6)); // beginIndex부터 endIndex까지 출력

        System.out.println(s1.length()); // 해당 문자열 길이 출력

    }
    



}
