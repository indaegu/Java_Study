// 23.08.17 (목) : final method 실습
package chapter06;

public class FinalMethodEx {
  public static void main(String[] args) {

  }
}
class Chess{
  enum CheesPlayer{
    WHITE,BLACK
  }

  final CheesPlayer getFirstPlayer(){
    return CheesPlayer.WHITE;
  }
}
class WorldChess extends Chess{

}
