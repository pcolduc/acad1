package Prac;

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("공간 크기 설정:");
        int N = sc.nextInt();
        int x = 5;
        int arr [] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println(i+1 + " 번째 데이터 입력");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (x >= arr[i]){
                System.out.println(arr[i]);
            }
        }

    }
}
