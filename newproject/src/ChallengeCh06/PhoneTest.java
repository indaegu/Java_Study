package ChallengeCh06;

public class PhoneTest {
  public static void main(String[] args) {
    Phone[] phones ={new Phone("황진이"), new Telephone("길동이","내일"), new SmartPhone("민국이","갤러그")};

    for (Phone phone : phones) {
      // 먼저 가장 구체적인 타입부터 확인합니다.
      if (phone instanceof SmartPhone) {
        ((SmartPhone) phone).playGame();
      } else if (phone instanceof Telephone) {
        ((Telephone) phone).autoAnswering();
      } else if (phone instanceof Phone) {
        phone.talk();
      }
    }
  }
}
