//23.09.04 (월) : 네트워크 (DNS로 IP 찾는 프로그램)
package chapter18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
  public static void main(String[] args) {
    InetAddress addr1 = null, addr2 = null;
    System.out.print("호스트 이름을 입력하세요 : ");
    Scanner scanner = new Scanner(System.in);
    String url = scanner.nextLine();

    try {
      addr1 = InetAddress.getByName(url);
    } catch (UnknownHostException e) {
      throw new RuntimeException(e);
    }
    System.out.println(url + " : " + addr1.getHostAddress());
  }
}
