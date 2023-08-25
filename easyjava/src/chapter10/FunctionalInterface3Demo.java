// 23.08.25 (금) : 이것이자바다 16장 (Lambda) :
package chapter10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterface3Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); //[1,2,3]

        for (Integer i :
                list) {
            System.out.println(i);
        }

        list.forEach(i -> System.out.println(i)); // 위의 코드와 동일한 문장이다.
        list.removeIf(i -> i % 2 ==0);
        list.forEach(i -> System.out.println(i));

        list.add(2);
        list.add(4);
        list.forEach(i -> System.out.println(i));

        list.replaceAll(i -> i*10);
        list.forEach(System.out::println);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);


        //Entry로 키와 값을 가져왔던 기존과 달리, 쉽게 키 벨류 값이 사용가능하다.
        map.forEach((k,v) -> System.out.println("Key is " + k + ", Value is "+ v));

    }
}
