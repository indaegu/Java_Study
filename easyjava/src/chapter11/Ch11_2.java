// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : 확인문제 1번(ArrayList를 선언하고 원소 문자열의 길이가 2인 동물만 출력하기)
package chapter11;



import chapter08.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ch11_2 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person("김열공",20));
        set.add(new Person("최고봉",56));
        set.add(new Person("우등생",16));
        set.add(new Person("나자바",35));

        Iterator<Person> iterator = set.iterator(); //Ctrl + Alt + v
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");  // 순서가 없기 때문에 예제와 다른 순서가 나온다.
        }
        System.out.println();
        //equals로 name과 num이 동일하면 중복되었다고 판단하는 코드작성

        //
        if(!set.contains(new Person("나자",25))){
            set.add(new Person("나자",25));
        }

//        System.out.println(new Person("나자바",35).hashCode()); // 서로 다른 hashcode가 출력된다 => 따라서 똑같이 생긴 원소를 추가해도
//        System.out.println(new Person("나자바",35).hashCode()); // 정상적으로 추가가 된다.

        Iterator<Person> iterator2 = set.iterator(); //Ctrl + Alt + v
        while (iterator2.hasNext()){
            System.out.print(iterator2.next() + " ");  // 순서가 없기 때문에 예제와 다른 순서가 나온다.
        }
        System.out.println();

    }

}

