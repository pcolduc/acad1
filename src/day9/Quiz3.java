package day9;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("공간 길이 설정 :");
        int N = sc.nextInt();
        int arr[] = new int[N];
//        int num = 3;
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            result += num;
//            arr[i] = result;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
        for (int i = 0; i < arr.length; i++) {
            int sub= i + 1;
            arr[i] = 3 * sub;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t",arr[i]);
        }
    }
}
