//23.08.16 수 : 상속에서 생기는 문제를 Override로 해결하는 실습
package chapter06;

public class InheritanceEx {
    public static void main(String[] args) {
        Circle circle =new Circle();
        circle.radius =2.0;

        Ball ball = new Ball();
        ball.radius = 2.0;
        // 원의 넓이와 공의 넓이는 달라야한다. 그러나 상속하면서 같은 값이 출력됨
        // 따라서 Override를 통해서 이 문제를 해결한다.
        System.out.printf("원의 넓이 : %.2f, 공의 넓이 : %.2f\n", circle.findArea(),ball.findArea());
        System.out.printf("공의 부피 : %.2f", ball.findVolume());
    }
}
