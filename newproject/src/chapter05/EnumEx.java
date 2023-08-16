//23.08.16 (수) : Enum(열거형) 실습
package chapter05;

public class EnumEx {
    public static void main(String[] args) {
        People people = new People();
        people.age =20;
        people.gender = Gender.MALE;
        people.direction = Direction.EAST;

        People anotherPeople = new People();
        anotherPeople.age =21;
        anotherPeople.gender = Gender.FEMALE;
        anotherPeople.direction = Direction.WEST;

        if(people.direction == Direction.EAST){ //타입에 의존하지 않고 Enum에 의존한다.
            System.out.println("동쪽 입니다");
        }
        if(people.gender==Gender.MALE){
            System.out.println("남자 입니다");
        }
        System.out.println(people.gender);
    }
    static class People {
        int age;
        Gender gender;
        Direction direction;
    }
    static class People1 {
        Gender gender;
        Direction direction;
    }
}
