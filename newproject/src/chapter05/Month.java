//23.08.16 (수) : Enum(열거형) 실습
package chapter05;

public enum Month {
    JAN(1), FEB(2),MAR(3),APR(4),MAY(5),JUN(6),JUL(7),AUG(8),SEP(9),OCT(10),NOV(11),DEC(12);

    private int month;
    private Month() {
    }
    private Month(int month) {
        this.month = month;
    }

    public int getMonthNum() {
        return month;
    }
}
