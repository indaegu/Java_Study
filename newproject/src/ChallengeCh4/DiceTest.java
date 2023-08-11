package ChallengeCh4;

public class DiceTest {
  public static void main(String[] args) {
    Dice d = new Dice();
    for(int i = 0; i < 6; i++){
      System.out.printf("구버전 주사위 숫자 : %d\n", d.roll());
    }
    for(int i = 0; i < 6; i++){
      System.out.printf("신버전 주사위 숫자 : %d\n", d.rollup());
    }
  }
}
