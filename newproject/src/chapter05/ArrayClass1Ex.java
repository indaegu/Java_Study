package chapter05;

import classsExample.CircleEx;

public class ArrayClass1Ex {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle((double) i+1);
        }
        for (Circle circle :
                circles) {
            System.out.println("원의 넓이 : " + circle.findArea());
        }
    }
}
