package day9;

public class Example02 {
    public static void main(String[] args) {
        int arr [] = {7,4,5,1,3};
        int temp = 0;
//        // 변수를 선언한 뒤 그 변수에 배열의 값이 저장되어 반복하게됨 .
//        // 배열의 길이만큼 코드가 반볻된다,
//        for (int i: arr) {//배열을 무조건 사용해야함.
//            System.out.print(i + " ");
        for (int i = 0; i < arr.length - i; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];


                }
            }
        }
    }
}
