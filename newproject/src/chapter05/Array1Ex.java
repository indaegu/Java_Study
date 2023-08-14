package chapter05;

public class Array1Ex {
    public static void main(String[] args) {
        int sum = 0;
        int avg;
        int sc1 = 90;
        int sc2 = 80;
        int sc3 = 100;
        
//        int [] scores = new int[3]; // 각 배열의 공간에 값은 0으로 초기화 됨(Java에선 int scores[]로 배열을 선언하는걸 선호하지 않음)
//        scores[0] = sc1;
//        scores[1] = sc2;
//        scores[2] = sc3;

        // 배열은 한번 생성되면 그 길이를 바꿀 수 없다. => 변경하려면 다른 길이의 배열을 다시 선언한다
        int [] scores = {90, 80, 100}; // Java에서 가장 자주 사용되는 배열 생성 방식

        for (int i =0; i <scores.length; i++){
            System.out.printf("scores[%d]에 위치한 값은 : %d \n", i, scores[i]);
        }

        for (int i = 0; i < scores.length; i++) {// fori 명령어로 만들어낸 반복문
            sum  += scores[i];
        }

        System.out.printf("모든 scores의 합은 : %d \n",sum);

        avg = sum /scores.length;
        System.out.printf("avg 값은 : %d\n", avg);

        // 배열 길이 동적으로 늘리기
        int[] scoresBig = new int[5];
        for (int i = 0; i < scores.length; i++) { //for 문으로 더 큰 배열로 값을 옮겨 담는 방법
            scoresBig[i] = scores[i];
        }
        scores = scoresBig; // 주소값을 할당 => 이렇게 하면 동적으로 scores의 배열 길이가 늘어남
        scores[4] = 110; // 기존 scores의 길이는 3이지만 4번째 index에도 값을 넣을수 있게 되었다.
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        //foreach로 배열 출력하기, 자료형은 실제 선언된 형태와 동일하게 맞춰야함
        for (int score: scores) {
            System.out.println("foreach로 출력한 score : " + score);
        }

    }
}
