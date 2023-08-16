//23.08.16 (수) : Enum(열거형) 실습
package chapter05;

public enum Gender {
    MALE("남성"), FEMALE("여성"); // name : MALE, value : "남성" 쌍
    private String gender;
    private Gender(){};

    private Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
