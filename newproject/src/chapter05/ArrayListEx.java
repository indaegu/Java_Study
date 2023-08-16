//동적 배열 실습 23.08.16 (수)
package chapter05;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); //ArrayList -> AbstractList -> AbstractListCollection 안에 toString이 존재
        System.out.println(numbers); // 출력결과 : [] -> 따라서 출력결과가 이렇게 나옴 // 동적배열 최초 생성시 [null, null, null]과 같은 형태
        numbers.add(10);
        System.out.println(numbers); // 출력결과 : [10] -> 10을 삽입하면 [null, 10, null]과 같은 형태 (tail이 10을 가르킴)
        numbers.add(9);
        System.out.println(numbers); // 출력결과 : [10, 9] -> 9를 삽입하면 tail이 9를 가르키고 [null, 10, null]의 3번째 null에 9가 삽입
        numbers.add(8);
        System.out.println(numbers); // 출력결과 : [10, 9, 8] -> 그냥 자바의 동적배열은 뒤쪽부터 들어간다고 생각하자(Double Linked List 형태)
        numbers.add(0,11); // index값을 지정해주면 해당 index에 element를 삽입하고 다른 element들을 뒤로 민다.
        System.out.println(numbers);
        System.out.println(numbers.size()); // number 동적배열의 element의 갯수인 4가 출력된다.
        numbers.remove(1); //index 1에 해당하는 "10"을 삭제
        System.out.println(numbers);
        System.out.println(numbers.get(2)); //index 2에 해당하는 값을 가져온다.
    }
}
