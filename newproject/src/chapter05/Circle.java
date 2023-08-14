package chapter05;

public class Circle {
        private double radius =0.0;

        public Circle(double radius) { //매개변수를 받을 수 있는 생성자
            this.radius = radius;
        }

        public Circle() { // 기본 생성자
        }

        public double getRadius() { //getter
            return radius;
        }

        //원의 넓이를 구하는 메서드
        public double findArea(){
            return Math.PI * Math.PI* radius;
        }

        public void setRadius(double radius) { //setter
            if (radius <= 0){
                System.out.println("원의 반지름은 0보다 커야 합니다. ");
            } else{
                this.radius = radius;
            }
        }
}
