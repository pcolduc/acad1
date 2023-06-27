package Prac;

public class Quiz8 {
    public static void main(String[] args) {
        int arr[] = {20,10,35,30,7};
        int big = -1000000;
        int small = 1000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];}if (arr[i] < small){
                small = arr[i];}
        }
        System.out.println("최댓값 : " + big + " 최소값 : " + small);
    }
}
