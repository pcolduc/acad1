package Prac;

public class Quiz2 {
    public static void main(String[] args) {
       int arr[] = new int[100];


       //An = An-1 + An-2;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i < 100 ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for (int i = 1; i <10 ; i++) {
            System.out.println(arr[i]+" ");
        }
        //두번째 방법
        int prexPrevNum = 1;
        int preNum = 1;
        System.out.println(prexPrevNum+" ");
        System.out.println(preNum+" ");
        for (int i = 3; i < 10; i++) {
            int nNum = prexPrevNum + preNum;
            System.out.println(nNum + " ");


            prexPrevNum = preNum;
            preNum = nNum;
        }
    }
}
