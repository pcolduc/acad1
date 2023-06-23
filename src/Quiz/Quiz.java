package Prac;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 0;
        int num = sc.nextInt();
        int test[] = new int[num];
        double result = 0;
        double newresult = 0;
        double avg = 0;

        for (int i = 0; i < test.length; i++) {
            System.out.println("점수 입력 : ");
            test[i] = sc.nextInt();
            if (test[i] > M){
                M = test[i];
            }
        }for (int j = 0; j < test.length; j++) {
            result += test[j];
            newresult = result / M * 100;
            avg = newresult / test.length;
        }System.out.println(avg);
    }
}
