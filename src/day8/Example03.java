package day8;

public class Example03 {
    public static void main(String[] args) {
        /*
        * 배열 선언과 초기값
        * */

        //5개의 공간을 가지는 배열 선언
        int intArray[] = new int[5];
        String strArray[] = new String[5];

        // 5개의 값을 가지는 배열 선언
        int arr[] = {1,2,3,4,5};

        System.out.println("intArray[0] = " + intArray[0]);//int는 값이 저장되어 있지 않을경우 0
        System.out.println("intArray[1] = " + intArray[1]);

        System.out.println("strArray[0] = " + strArray[0]);//공간만 있고 값이 없을경우 null
        System.out.println("strArray[1] = " + strArray[1]);

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[3] = " + arr[3]);
    }
}
