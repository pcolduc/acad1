package Section5;

public class _03_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        // 별 (*) 사각형 만들기
        /*
         *
         * *****
         * *****
         * *****
         * *****
         * ******/


        //별(*) 외쪽 삼각형 만들기.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5-i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}//오른쪽으로 치우친 삼각형 만들기.



