package sample;

public class Init {
    public static void main(String[] args) {
        char var = 'A';
        String s1 = "여러 문자열" // 이렇게 선언하면 한줄로 출력됨
                + " 넣기"
                + "테스트";
        String s = """
                여러 문자열 
                넣기
                테스트
                """; // 인용문자 3개로 선언하면 줄바꿈도 함께 저장된다
        System.out.println(s);
    }
}
