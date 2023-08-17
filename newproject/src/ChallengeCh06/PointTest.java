package ChallengeCh06;

public class PointTest {
  public static void main(String[] args) {
    MovablePoint m = new MovablePoint(3,4,10,20);
    m.toString();
    Point p = m;
    p.toString();
  }
}
