// 23.08.16 (수) : main 메서드로 받은 인수 2개를 출력하는 실습
package chapter05;


public class MainArgumentDemo {
    public static void main(String[] args) {
        Integer argNum = Integer.parseInt(args[1]); // parseInt를 통해 2번째 매개변수 (String) "3"을 (int) 3으로 변환했다.
        argsFor(args[0],argNum);
    }

    public static void argsFor(String word, int num){
        for (int i = 0; i < num; i++) {
            System.out.printf("(%d/%d) %s \n",i+1,num,word);
        }
    }
}
