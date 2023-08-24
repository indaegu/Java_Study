// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : Set 실습

package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = Set.of("A", "b", "c", "d", "e"); // 불변객체(바뀔수없다)
        HashSet<String> hashSet = new HashSet<>(set); // 가변객체로 만들어준다.
        hashSet.add("F");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // A b c d e F
        }
        System.out.println();
        System.out.println(set); // [e, d, c, b, A]
        System.out.println(hashSet); // [A, b, c, d, e, F]

        boolean e = hashSet.add("E");
        if (!e) System.out.println("추가하지 못했습니다!");
        System.out.println("E의 hashcode 값 : " + "E".hashCode()); //E의 hashcode 값 : 69

        //SetList안에 존재가 여부하는지 확인하는 함수, 그러나 이미 존재하는 함수다.
        boolean isExist = false;
        for (String ele : hashSet
        ) {
            if (ele.hashCode() == "F".hashCode()) {
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            hashSet.add("F");
        } else {
            System.out.println("F가 이미 존재합니다");
        }
        System.out.println("E의 hashcode 값 : " + "F".hashCode());// E의 hashcode 값 : 70


    }
}
