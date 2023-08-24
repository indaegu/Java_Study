package chapter08;

import java.util.Objects;

public class Person {
  private String name;
  private int num;

  public Person(String name, int num) {
    this.name = name;
    this.num = num;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person person = (Person) obj;
    return num == person.num && (Objects.equals(name, person.name));
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + num;
    return result;
  }

  @Override
  public String toString() {
    return "Person[" + name + " : " + num + "]";
  }
}
