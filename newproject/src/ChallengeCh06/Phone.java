// 23.08.17 (목) : 다형성 실습

package ChallengeCh06;

public class Phone {
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  void talk(){
    System.out.println("Phone에서 실행된 talk");
  }
}

class Telephone extends Phone{
  private String when;

  public Telephone(String owner) {
    super(owner);
  }

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  void autoAnswering(){
    System.out.println(owner + "Telephone에서 실행된 autoAnswering");
  }
}

class SmartPhone extends Telephone{
  private String game;
  public SmartPhone(String owner) {
    super(owner);
  }

  // 2개의 매개변수를 받는 새로운 생성자. 'when'에는 기본값으로 "오늘"을 설정했습니다.
  public SmartPhone(String owner, String game) {
    super(owner);
    this.game = game;
  }
  void playGame(){
    System.out.println(owner + game+ "SmartPhone에서 실행된 playGame");
  }
}
