//23.08.22 (화) : 이것이 자바다. 확인문제 9장 7번, 컴파일 에러 나는 이유 설명
package Challenge09;

public class Chatting {
  class Chat {
    void start() {}
    void sendMessage(String message) {}
  }
  void startChat(String chatId) {
    String nickName = null;
    nickName = chatId;
    String finalNickName = nickName;
    Chat chat = new Chat() {
      @Override
      public void start() {
        while(true) {
          String inputData = "안녕하세요";
          String message = "[" + finalNickName + "] " + inputData; //내부 클래스 내에서 액세스되므로 final 또는 유사 final이어야 합니다
          sendMessage(message);
        }
      }
    };
    chat.start();
  }
}