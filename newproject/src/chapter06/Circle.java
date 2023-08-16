//23.08.16 수 : 상속에서 생기는 문제를 Override로 해결하는 실습
package chapter06;

public class Circle {
    double radius;

    private void secret(){
        System.out.println("private");
    }

    protected void findRadius(){
        System.out.println("반지름이 몇 입니다");
    }
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
