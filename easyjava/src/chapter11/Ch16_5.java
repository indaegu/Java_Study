// 23.08.25 (금) : 이것이 자바다 16장 (Lambda) : 확인문제 5번
package chapter11;


public class Ch16_5 {
  public static void main(String[] args) {
    Button btnOk = new Button();
    btnOk.setClickListener(()-> System.out.println("OK 버튼을 클릭했습니다."));
    btnOk.click();

    Button btnCancel = new Button();
    btnCancel.setClickListener(()-> System.out.println("Cancel 버튼을 클릭했습니다."));
    btnCancel.click();
  }
}
class Button {
  //정적 멤버 인터페이스(함수형 인터페이스)
  @FunctionalInterface
  public static interface ClickListener {
    void onClick();
  }
  private ClickListener clickListener;
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }
  public void click() {
    this.clickListener.onClick();
  }
}