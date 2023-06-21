package day8;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        /*
        * 길이가 5인 배열을 입력받아 배열안의 모든 값의
        * 총합과 평균을 구하세요
        *
        * 출력결과
        * 1번째 요소 입력 50
        * 2번째 24
        * 3번째 30
        * 4번째 22
        * 5번째 21*/
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[5];
        int i = 0;
        double val  = 0;
        int sum = 0;

        for ( i = 0; i < arr.length ; i++) {
            System.out.println(i + 1 +"데이터 입력");
            arr[i] = sc.nextInt();
            sum = arr[i] + sum;
        }
        val  = sum / (double)arr.length;
        System.out.println("총합"+sum);
        System.out.println("평균"+val);

    }
}
