// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : Queue 실습
package chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>(); // Queue를 불러오면 구현체를 자동 생성을 해버리니, LinkedList를 빌려온다
        q.add("바나나");
        q.add("사과");
        q.add("배");

        while (!q.isEmpty()){
            System.out.println(q.remove() + "가 삭제되었습니다.");
        }
    }
}
