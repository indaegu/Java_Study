package chapter05;

public class String4Ex {
    public static void main(String[] args) {
        String java = String.format("%s, %.1f", "Java", 3.14); // 지정한 format에 맞게 문자열을 출력해줌(ctrl + Alt + v로 반환하는 문자열 확인 및 선언가능)
        System.out.println(java);
        String join = String.join(",", "apple", "banana");// delimiter에는 null이 오면 안된다.
        System.out.println(join);
        String s = String.valueOf(3.14); // Overloading 되어있어 각기 다른 타입의 매개변수를 모두 문자열로 변환 해준다.
        System.out.println(s);
    }
}
