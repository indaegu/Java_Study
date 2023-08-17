package ChallengeCh06;

public class Point {
  private int x,y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String toString(){
    System.out.printf("X좌표 : %d, Y좌표 : %d\n",getX() ,getY());
    return null;
  }
}

class MovablePoint extends Point{
  private int xSpeed, ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }


  public String toString(){
    System.out.printf("X좌표 : %d, Y좌표 : %d, X스피드 : %d, Y스피드 : %d\n",getX() ,getY() ,getxSpeed() , getySpeed());
    return null;
  }
}


