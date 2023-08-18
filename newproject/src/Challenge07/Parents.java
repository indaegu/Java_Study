// 23.08.18 (금) : 7장 확인문제 6번 super를 이용 실습
package Challenge07;

public class Parents{
    public String name;
    public Parents(String name) {
      this.name = name;
    }

}
class Child extends Parents {
  public int studentNo;
  public Child(String name, int studentNo) {
    super(name);
    this.studentNo = studentNo;
  }
}
