package control;

public class For1Ex {
  public static void main(String[] args) {
    //for문
    for(int i = 0; i <10; i++){
      System.out.printf("for문 = hello world : %d번째 출력\n", i+1);
      //System.out.println("hello world : " + (i+1) + "번째 출력");
    }

    //while문
    int i = 0;
    int breaknum = 10;
    System.out.printf("%d번 만큼의 반복을 진행합니다. \n", breaknum);
    while(true){ //무한 반복문으로 만들고 빠져나오는 방식에서 좋다. ex) while(true) {num == 100 break;}
      System.out.printf("while문 = hello world : %d번째 출력\n", i+1);
      i++;
      if(i == breaknum)
        break;
    }
  }
}
