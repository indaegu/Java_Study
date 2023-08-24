// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : List 컬렉션
package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> cars = List.of("소나타","아반테","캐스퍼");
        List<String> list = new ArrayList<>(cars);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }
        System.out.println();

        list.add("소울"); // asList로 선언했을때와 달리 가변으로 선언해서 add가 가능하다.
        for (String car:list
             ) {
            System.out.print(car + " : ");
        }
        System.out.println();

        list.add(0,"K5");
        for (String car:list
        ) {
            System.out.print(car + " : ");
        }
        System.out.println();
    }
}
