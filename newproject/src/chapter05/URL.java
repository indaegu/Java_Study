package chapter05;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("URL을 입력하세요 : ");
            String URL = scanner.next();
            if(URL.equals("bye")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if(URL.substring(URL.length()-3,URL.length()).equals("com")){ //endWith("com")으로도 사용 가능하다
                System.out.println(URL + "은 'com'으로 끝납니다");
            }else {
                System.out.println(URL + "은 'com'으로 끝나지 않습니다");
            }
            if (URL.contains("java")==true){
                System.out.println(URL + "은 'java'를 포함합니다.");
            }else {
                System.out.println(URL + "은 'java'를 포함하지 않습니다.");
            }
        }
    }
}
