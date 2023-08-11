package classsExample;

public class Phone {
  private static long numberOfPhones; // class 변수는 기본값을 제공해준다.

  public static long getNumberOfPhones() { //getNumberOfPhones을 외부 클래스에서 사용하기위해 getter를 만들어준다
    return numberOfPhones;
  }
  String model ;
  int value;

//  public Phone(){}

  public Phone(String model, int value) {
    this.model = model;
    this.value = value;
    numberOfPhones++ ;
  }

  void print(){
    System.out.println("가격 : " + value + "원 기종 : " + model);
  }
}
