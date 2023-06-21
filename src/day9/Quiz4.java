package day9;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력 :");
        int n = sc.nextInt();
        int fibo[] = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = (fibo[i-1]) + (fibo[i-2]);
        }
        for (int i = 0; i < fibo.length; i++) {
            System.out.printf("%d\t",fibo[i]);
        }
    }
}
