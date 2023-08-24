// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : ArrayList와 LinkedList 속도비교
package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_00; i++) {
            ll.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("LinkedList add 시간 : " + (endTime1 - startTime1) + "msec"); //LinkeList가 생성시간이 좀더 오래걸린다.


        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_00; i++) {
            al.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList add 시간 : " + (endTime - startTime) + "msec");
    }
}