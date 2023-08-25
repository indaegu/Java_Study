// 23.08.25 (금) : 이것이 자바다 16장 (Lambda) : 확인문제 8번
//8. 다음은 학생의 영어 평균 점수와 수학 평균 점수를 계산하는 코드입니다. 빈 곳에 avg() 메소드를 작성해보세요.
package chapter11;

public class Ch16_8 {
  // 학생 데이터를 저장하기 위한 정적 배열 초기화
  private static Student1[] students = {
      new Student1("홍길동", 90, 96),
      new Student1("신용권", 95, 93)
  };

  // 제네릭을 사용한 함수형 인터페이스 Function을 인자로 받아 학생들의 평균 점수를 계산하는 메서드
  public static double avg(Function<Student1> s) {
    double total = 0; // 점수의 합계를 저장하기 위한 변수

    // 모든 학생에 대해 주어진 람다 함수 s를 적용하여 점수를 계산하고 합계에 더함
    for (Student1 student : students) {
      total += s.apply(student);
    }

    // 학생들의 평균 점수를 반환
    return total / students.length;
  }

  public static void main(String[] args) {
    // 람다 표현식을 사용하여 영어 점수의 평균을 계산하고 출력
    double englishAvg = avg( s -> s.getEnglishScore() );
    System.out.println("영어 평균 점수: " + englishAvg);

    // 람다 표현식을 사용하여 수학 점수의 평균을 계산하고 출력
    double mathAvg = avg( s -> s.getMathScore() );
    System.out.println("수학 평균 점수: " + mathAvg);
  }
}

// 학생 정보를 저장하는 클래스
class Student1 {
  // 학생의 이름, 영어 점수, 수학 점수를 위한 멤버 변수
  private String name;
  private int englishScore;
  private int mathScore;

  // Student1 객체 생성시 초기값을 설정하기 위한 생성자
  public Student1(String name, int englishScore, int mathScore) {
    this.name = name;
    this.englishScore = englishScore;
    this.mathScore = mathScore;
  }

  // 각각의 getter 메서드로 해당 멤버 변수의 값을 반환
  public String getName() { return name; }
  public int getEnglishScore() { return englishScore; }
  public int getMathScore() { return mathScore; }
}

// 제네릭을 사용한 함수형 인터페이스 선언
// T 타입의 객체를 받아 double 타입의 값을 반환하는 apply 메서드를 정의
@FunctionalInterface
interface Function<T> {
  public double apply(T t);
}

