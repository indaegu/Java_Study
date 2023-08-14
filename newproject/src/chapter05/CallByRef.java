package chapter05;

public class CallByRef {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(10.0);

        zero(c1);
        System.out.println("c1 메소드 실행 후 반지름 : " + c1.getRadius());

        zero(c2);
        System.out.println("c2 메소드 실행 후 반지름 : " + c2.getRadius());
        
        
    }
    
    public static void zero(Circle c){ //CallbyRef : read 와 write가 가능
        c.setRadius(0.1);

    }
    public static void zero(double r){  //CallbyValue " read만 가능
        r = 0.1;
    }
}
