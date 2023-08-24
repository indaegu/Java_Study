// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : ArrayList와 LinkedList  속도 성능 비교

package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Performance1Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            al.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList add 시간 : " + (endTime - startTime) + "msec");


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            ll.add(0, i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("LinkedList add 시간 : " + (endTime1 - startTime1) + "msec"); //LinkeList가 생성시간이 좀더 오래걸린다.


        long delStartTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            al.remove(i); // ArrayList는 애초에 방향 설정이 불가능한 순방향
        }
        long delEndTime = System.currentTimeMillis();
        System.out.println("ArrayList remove 시간 : " + (delEndTime - delStartTime) + "msec");


        long delStartTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            ll.removeFirst();// remove(i)로 설정해서 index를 찾아 지우는것보다 removeFirst나 removeLast를 사용하면 훨씬 빠르다!
        }
        long delEndTime1 = System.currentTimeMillis();
        System.out.println("LinkedList remove 시간 : " + (delEndTime1 - delStartTime1) + "msec");
    }
}
