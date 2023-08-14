package chapter05;

public class ArrayClass1Ex {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle((double) i+1);
        }
        for (Circle circle :
                circles) {
            System.out.println("원의 넓이 : " + circle.getRadius());
        }
        for (int i = 0; i < circles.length; i++) {
            change(circles[i]);
        }
        for (Circle circle :
                circles) {
            System.out.println("1씩 증가한 원의 넓이 : " + circle.getRadius());
        }
    }

    // 원의 반지름을 1씩 증가시키는 함수
    public static void change(Circle c){ //CallbyRef : read 와 write가 가능
        c.setRadius(c.getRadius()+1);
    }
}
