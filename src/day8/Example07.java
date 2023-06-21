package day8;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        /*
        * 길이가 5인 배열을 입력받아 인덱스가 3번인 곳은
        * 출력하지 말고 나머지만 출력
        * */
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[5];
        int i = 0;
        for ( i = 0; i < arr.length; i++) {

            System.out.println(i + 1 +" 번째 데이터 입력.");
            arr[i] = sc.nextInt();
        } if (i != 3){
        }System.out.println(arr[i]);
//        for (int i = 0; i < arr.length; i++) {
//            if(i != 3){
//                System.out.println(arr[i]);
//            }                                       //      내가 푼거
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 3){
//                continue;
//            }
//            System.out.println(arr[i]);
//        }                                                 수업 풀이!
    }
}
