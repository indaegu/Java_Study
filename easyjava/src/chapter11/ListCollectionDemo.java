// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : List 컬렉션

package chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListCollectionDemo {
    public static void main(String[] args) {
        String[] animals1 = {"호랑이", "사자", "사슴", "곰"};
        List<String> list = Arrays.asList(animals1);
        System.out.println("list : " + list);

        list.set(3, "앵무새");

        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

//        list.add("고양이"); // asList는 고정크기 리스트이기 때문에 add가 불가능
//        list.remove(0); // asList는 고정크기 리스트이기 때문에 remove도 불가능

        for (String ani :
                list) {
            System.out.print(ani + ",");
        }

//        list.sort(new Comparator<String>() { // Comparator의 익명객체 생성, 람다 학습후에 다시 돌아오기로(23/08/24)
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
    }
}
