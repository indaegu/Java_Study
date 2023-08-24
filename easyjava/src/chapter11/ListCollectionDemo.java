// 23.08.24 (목) : 쉽게 배우는 자바 11장 (Collection) : List 컬렉션

package chapter11;

import java.util.Arrays;
import java.util.List;

public class ListCollectionDemo {
    public static void main(String[] args) {
        String[] animals1 = {"호랑이", "사자", "사슴", "곰"};
        List<String> list = Arrays.asList(animals1);
        System.out.println(list);
    }
}
