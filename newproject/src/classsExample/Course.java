package classsExample;
/*
학생의 수를 늘리거나 낮추는 클래스
*/

public class Course {
  String id;
  String name;
  int numOfStudents;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getNumOfStudents() {
    return numOfStudents;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(int student){
    numOfStudents += student;
  }

  public void deleteStudent(int student){
    numOfStudents -= student;
  }
}
