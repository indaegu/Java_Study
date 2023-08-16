//23.08.16 수 : 상속에서 생기는 문제를 Override로 해결하는 실습
package chapter06;

public class Ball extends Circle{
    @Override
    public double findArea(){
        return 4 * Math.PI * radius * radius;
    }

    @Override
    protected void findRadius() {
        super.findRadius();
    }

    public double findVolume(){
        return 4/3 * (Math.PI * radius*radius*radius);
    }
}
