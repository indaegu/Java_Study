// 23.08.23 (수) : 쉽게 배우는 자바 9장 제네릭(두 개 이상의 매개변수를 받은경우)

package chapter09;

public class EntryDemo {
  public static void main(String[] args) {
    Entry<String, Integer> e1 = new Entry<>("김선달", 20);
    Entry<String, String> e2 = new Entry<>("기타", "등등");
//    Entry<int, String> e3 = new Entry<>(30, "홍길동");
    System.out.println(e1.getKey() + " " + e1.getValue());
    System.out.println(e2.getKey() + " " + e2.getValue());
  }
}

class Entry<K, V>{
  private K key;
  private V value;

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public Entry(K key, V value) {
    this.key = key;
    this.value = value;
  }
}
