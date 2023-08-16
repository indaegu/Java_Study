package chapter05;

public enum EnumGrade {
    A("Perfect"), B("Good"), C("SoSo");
    private String grade;
    private EnumGrade() {
    }

    private EnumGrade(String grade) {
        this.grade = grade;
    }

    public String getEnumGrade() {
        return grade;
    }

}
