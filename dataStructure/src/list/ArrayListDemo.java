// 23.08.30 (수) : 자료구조 (ArrayList, LinkedList)
package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(); // 크기가 정해져있고 원소가 늘어남에 따라 증가함
    // 추가 및 삭제 : 느림 (단, 미리 자바에서 생성된 크기보다 작을경우 빠름)
    // 인데스 조회 : 빠름

    numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4); numbers.add(2);
    System.out.println(numbers); // 출력결과 : [1, 2, 3, 4, 2] / 뒤에서 부터 원소가 들어간다.

    numbers.remove(3); // 인덱스 3에 대한 원소가 지워짐 "4"가 지워진다.
    System.out.println(numbers);// 출력결과 : [1, 2, 3, 2]

    LinkedList<Integer> ll = new LinkedList<>(); // 비어있는 리스트 생성
    // 추가 및 삭제 : 빠름
    // 인데스 조회 : 느림
    ll.add(100); ll.add(200); ll.add(300); ll.add(400);
    System.out.println(ll); // 출력결과 : [100, 200, 300, 400]

    ll.remove(1);
    ll.removeFirst(); // 맨 앞의 원소를 하나 지운다.
    ll.removeLast();// 맨 뒤의 원소를 하나 지운디.
    System.out.println(ll); // 출력결과 : [100, 300, 400] / index 1에 해당하는 "200"이 삭제됨
  }
}
