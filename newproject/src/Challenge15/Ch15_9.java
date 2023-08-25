// 23.08.25 (금) : 이것이 자바다 15장 (Collection) : 확인문제 9번
// HashMap에 아이디(String)와 점수(Integer)가 저장되어 있습니다.
// 실행 결과와 같이 평균 점수, 최고 점수, 최고 점수를 받은 아이디를 출력하도록 코드를 작성해보세요.
package Challenge15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Ch15_9 {
  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<String,Integer>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);
    String name = null; //최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0; //최고 점수를 저장하는 변수
    int totalScore = 0; //점수 합계를 저장하는 변수

    //최고 점수
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // map에서 모든 엔트리들을 가져와서 entrySet이라는 변수에 저장
    for (Map.Entry<String, Integer> entry : entrySet) {
      totalScore += entry.getValue(); // 점수 합계 계산
      if(maxScore <= entry.getValue()){ // 최고점수 산출
        maxScore = entry.getValue();
        name = entry.getKey();
      }
    }
    //평균점수
    double avgScore = (double) totalScore / map.size(); // 평균 점수 계산

    System.out.println("평균 점수: " + avgScore);
    System.out.println("최고 점수: " + maxScore);
    System.out.println("최고 점수를 받은 아이디: " + name);




  }
}