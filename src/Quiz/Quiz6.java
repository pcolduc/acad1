package Prac;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("숫자 입력");
        int num = sc.nextInt();
        System.out.println("숫자 입력");
        int num1 = sc.nextInt();


        int val = 0;
        for (int i = 1; i <= num || i <= num1; i++) {
            if (num % i == 0 && num1 % i == 0){
                System.out.println("공약수 :"+i);
                val = i;
            }
        }
        System.out.println(val);
    }
}
