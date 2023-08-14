package chapter05;

public class CountChar {
    public static void main(String[] args) {
    countChar("Hello", 'l');

    }
    public static void countChar(String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("문자열에 해당 문자가 포함된 개수는 : " + count);
    }
}
