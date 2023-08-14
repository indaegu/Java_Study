package chapter05;

public class ArrayStringEx {
    public static void main(String[] args) {
        String[] names = new String[3];
        for (String name: names) {
            System.out.println(name); //출력결과 : null
        }
        names[0] = "kim";
        names[1] = "lee";
        names[2] = "park";

        for (String name : names) {
            System.out.println(name);
        }

    }
}
