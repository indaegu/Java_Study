package sample;

/*
public : 접근 제한자로서 모두 접근이 가능하다는걸 의미
class : 클래스 정의하겠다는 키워드
Hello : 클래스 이름을 정의(첫 글자는 대문자로 하는게 불문율)
void : 메서드를 실행한 후 반환값이 없다는걸 의미
static : 이 클래스에 종속적으로 만들어진다는 의미
main : 메서드명
String[] args: 메서드 매개변수 타입과 매개변수
*/


/** 문서 주석
 * Hello sample class
 * main-method
 * hello를 출력하는 프로그램
 */
public class Hello {
  public static void main(String[] args) { //psvm 명령어를 통해 만들어짐
    //문자, _, $로만 시작해야함, 한글도 가능, 영문자는 대소문자 구분, +,- 연산자는 안됨, 예약어 불가능, 길이제한 없음(요즘은 커뮤니케이션을 위해 길게씀)
    final double PI = 3.141592;// 상수는 전체를 대문자로 표기, 상수는 프로그램 실행중 값이 바뀔수없다.
    final long LIGHT_SPEED = 300000L;
    String hello = "안녕 !"; //변수와 메서드는 모두 소문자
    String helloWorld = "안녕 세상아"; //단, 두 개이상의 복합어면 camelCase로 작성
    int i = 2100_000_000; // int가 가용할 수 있는 범위 이상을 선언하면 오류 발생, 그런 경우 long으로 변경하기
    long ii = 2200_000_000L;
    char c = 'A'; // 아스키코드 65가 들어가있음, 문자는 ''로 선언
    var num = 100; // int라고 판단하고 4bytes를 확보함, var는 권장사항이 아님

    char three = 3 + '0';
    int iii = '3' - '0';
    String str3 = 3 + "";
    int i3 = Integer.parseInt(str3); // 형변환을 위한 함수
    int res = i3 + 10;
    String num1 = "1234";
    char cc = num1.charAt(0); // 문자열중 0번째 index 값을 가지고 온다

    double res1 = 7 /(double) 4; // 7이나 4중에 하나라도 double로 설정해주면 다른 숫자가 자동형변환되어 출력된다.
    System.out.println(res1);

    System.out.println(three);
    System.out.println(iii);
    System.out.println(i3);
    System.out.println(res);
    System.out.println(cc);

    System.out.println("Hello world"); //sout 명령어를 통해 만들어짐 / 자바는 문자열은 반드시 ""로 해야함
    System.out.println(hello); //변수를 출력할때는 ""(인용부호)를 작성하지 않는다.
    System.out.println(helloWorld);
    System.out.println(LIGHT_SPEED);
    System.out.println(c);
    System.out.println("안녕을 출력 " + "해보자");
    int i = 3;
    double d3 = 3.0;
    System.out.println(""); // 줄바꿈을 하는 출력문
    System.out.printf("i = %d and double d3 = %f\n",i,d3 ); // souf 로 생성 : 출력형태를 명시해주는 출력문




  }
}
