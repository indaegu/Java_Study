// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : 컬렉션의 반복 처리

package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "-");
        }
        System.out.println();

        while (iterator.hasNext()){// iterator는 일회용이다. 다시 사용하려면 다시 생성해야한다.

            System.out.print(iterator.next() + "-");
        }
        System.out.println();

        Iterator<String> iterator1 = list.iterator(); // iterator는 일회용이다. 다시 사용하려면 다시 생성해야한다.
        while (iterator1.hasNext()){
            System.out.print(iterator1.next() + "-");
        }
        System.out.println();
    }
}