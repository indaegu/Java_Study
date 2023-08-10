package control;

public class Switch2Ex {
  public static void main(String[] args) {
    WhoisIt("호랑이");
    WhoisIt("독수리");
    WhoisIt("도마뱀");
  }
  static void WhoisIt(String bio) {
    String kind = "";
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      case "고등어":
        kind = "어류";
        break;
      default:
        kind = "해당없음";
        break;
    }
    System.out.println(bio + "의 종류는 : " + kind);
  }
}
