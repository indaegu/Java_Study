// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : List 컬렉션
package chapter11;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty());


        stack.push("main");
        stack.push("add");
        stack.push("println");

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "-");
        }
        System.out.println();
        System.out.println("시작전 스택 상황 : " + stack);
        for (int i = 0; i <= stack.size() + 1; i++) { // pop될때 stack.size가 줄어들면서 +1을 해줘야 정상적으로 모두 나온다
            System.out.println("pop 진행전 스택사이즈 : " + stack.size() + ", i값 : " + i);
            System.out.print("pop된 작업 : " + stack.pop() + ", 스택 상황 : ");
            System.out.println(stack);
            System.out.println("pop 진행후 스택사이즈 : " + stack.size() + ", i값 : " + i);
            System.out.println();
        }



    }
}
