// 23.08.25 (금) : 이것이 자바다 15장 (Collection) : 확인문제 8번
// HashSet에 Student 객체를 저장하려고 합니다.
// 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않도록 하고 싶습니다.
// Student 객체의 해시코드는 학번이라고 가정하고 Student 클래스를 작성해보세요.
package Challenge15;

import java.util.HashSet;
import java.util.Set;

public class Ch15_8 {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<Student>();
    set.add(new Student(1, "홍길동"));
    set.add(new Student(2, "신용권"));
    set.add(new Student(1, "조민우"));
    System.out.println("저장된 객체 수: " + set.size());
    for(Student s : set) {
      System.out.println(s.studentNum + ":" + s.name);
    }
  }

}
class Student {
  public int studentNum;
  public String name;

  public Student(int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }
  @Override
  public int hashCode() {
    return studentNum; // 학번을 해시코드로 사용
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Student) {
      Student other = (Student) obj;
      return this.studentNum == other.studentNum; // 학번이 같으면 true 반환
    }
    return false;
  }
}

