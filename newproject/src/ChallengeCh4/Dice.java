package ChallengeCh4;

public class Dice {
  private double Num;

  public Dice() {
  }
  public int roll(){
    double num16 = 0.166666666666666666666666666666666666;

    double v = Math.random();
    if(v <= num16) {
      return 1;
    } else if (v <= num16 * 2 && v > num16){
      return 2;
    }else if (v <= num16 * 3 && v > num16 * 2){
      return 3;
    }else if (v <= num16 * 4 && v > num16 * 3){
      return 4;
    }else if (v <= num16 * 5 && v > num16 * 4){
      return 5;
    }else if (v <= num16 * 6 && v > num16 * 5){
      return 6;
    } else {
      return 0;
    }
  }

  public int rollup(){
    return (int) Math.ceil((Math.random()*6)); // 소숫점아래에 있는건 다버리고 +1 해주는 함수
  }
}
