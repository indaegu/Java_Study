package chapter05;

public class InterestRate {
    public static void main(String[] args) {
        double[][] interests =
                        {{3.2, 3.1, 3.2, 3.0},
                         {2.9, 2.8, 2.7, 2.6},
                        {2.7, 2.6, 2.5,2.7}};

        double[] sum1 = {0.0, 0.0, 0.0, 0.0};
        double sum2 = 0.0;

        int i=0;
        for (double[] interest1: interests) {
            for (double interest2: interest1) {
                sum1[i] += interest2;
            }
            System.out.printf("%d년도 평균 이자율 = %.2f%%\n", i+1,sum1[i]/4);
            sum2 += sum1[i]/4;
            i++;
        }
        System.out.printf("%d년간 평균 이자율  = %.2f%%\n",sum1.length-1,sum2/3);
    }
}
