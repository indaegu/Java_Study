// 23.08.28 (월) : 쉽게배우는자바 12장 (스트림) : Optional
package chapter12;

import java.util.Optional;
public class Optional2Demo {
  public static void main(String[] args) {
    String s1 = "안녕";
    String s3 = null;
    Optional<String> o = Optional.ofNullable(s1);
    Optional<String> o3 = Optional.ofNullable(s3);

    Util.print(Optional.ofNullable(s1));
    Util.print(Optional.ofNullable(s3));

    if(s1 != null)
      Util.print(s1);
    else
      Util.print("없음");

    if(o3.isPresent())
      Util.print(o3.get());
    else
      Util.print("없음");

    o3.orElse("없음"); // 값이 없으면 default 값을 삽입한다.
    Util.print(o3);


    o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));
  }
}