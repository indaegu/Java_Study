//23.08.22 (화) : 이것이 자바다. 확인문제 9장 5번, 인터페이스 가져오기
package Challenge09;

public class ActionExample {
  public static void main(String[] args) {
    Action action = new Action() {
      @Override
      public void work() {
        System.out.println("복사를 합니다.");
      }
    };
        action.work();
  }
}
