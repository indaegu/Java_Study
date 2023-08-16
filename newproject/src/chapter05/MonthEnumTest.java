//23.08.16 (수) : Enum(열거형) 실습
package chapter05;

public class MonthEnumTest {
    public static void main(String[] args) {
        Month month = Month.APR;

        System.out.println(month.name());
        System.out.println(month.getMonthNum());
        System.out.println(month.ordinal());
    }
}
