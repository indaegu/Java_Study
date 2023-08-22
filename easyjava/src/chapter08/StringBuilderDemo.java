package chapter08;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = new String("hi");
        System.out.println(s.hashCode()); // 출력결과 : 3329
        s = s + "!";
        System.out.println(s.hashCode()); // 출력결과 : 103232
        // 의미 : 문자열을 수정한게 아니라 새로운 문자열을 정의 한것

        StringBuilder sb = new StringBuilder("hi");
        System.out.println(sb.hashCode()); // 출력결과 : 1831932724
        sb = sb.append("!");
        System.out.println(sb.hashCode()); // 출력결과 : 1831932724
        //의미 : append를 이용해 기존의 문자열에 !를 추가한것이라 같은 해시코드xxxqqqqqqqqqq:q1
        // 반환함 => 수정되었다.

        StringBuilder sb1 = new StringBuilder("Hello, World");
        System.out.println(sb1.capacity()); // 크기를 반환하는 함수
        System.out.println(sb1.delete(0,5));
        System.out.println(sb1.capacity());


        System.out.println(sb1.replace(0, 2, "Good bye").insert(0, "Java, ")); // 수정과 삽입
    }
}
