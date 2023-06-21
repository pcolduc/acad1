package day8;
public class Example01 {
    public static void main(String[] args) {
      /*
      * 배열 Array
      * - 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다룸
      * - 생성된 배열의 각 저장공간을 배열의 요소라고 하며
      * 인덱스(index) s는 배열의 요소마다 붙혀진 일련번호로 각 요소를ㄹ
      * 구분하는데 사용한다
      *
      * */
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
        System.out.println(arr);//주소값이 출력됨
        String str[] = {"사과","포도","바나나"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        int list[] = null;
          list = new int[4];
        for (int i = 0; i < list.length; i++) {
            list [i] = i+1;
            System.out.println(list[i]);
        }
    }
}
