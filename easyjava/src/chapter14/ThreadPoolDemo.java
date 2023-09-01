//2023.09.01 (금) : Thread (Thread 구현)
package chapter14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
  public static void main(String[] args) {
    Runnable task = () ->{
      for (int i = 0; i < 5 ; i++) {
        System.out.println("쓰레드를 통해 실행된 안녕!");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
        }
      }
    };

    ExecutorService ex = Executors.newFixedThreadPool(4);
    ex.submit(task);


    for (int i = 0; i < 5 ; i++) {
      System.out.println("메인에 실행된 안녕!");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }

    ex.shutdown(); // 병렬 실행이 모두 끝나면 shutdown()으로 코드를 종료해준다.
  }
}
