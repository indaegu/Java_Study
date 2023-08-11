package classsExample;

public class PhoneEx {
  public static void main(String[] args) {
    Phone myPhone = new Phone("갤럭시 S23", 1_000_000);
    myPhone.print();
    System.out.println(Phone.getNumberOfPhones() + "대 생성");
    System.out.println(myPhone.getNumberOfPhones());

    Phone yourPhone = new Phone("아이폰 15", 1_120_000);
    yourPhone.print();
    System.out.println(Phone.getNumberOfPhones() + "대 생성");
    System.out.println(yourPhone.getNumberOfPhones());

  }
}
