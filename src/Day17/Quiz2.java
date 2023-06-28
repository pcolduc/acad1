package Day17;

import java.util.LinkedList;

public class Quiz2 {
    public static void main(String[] args) {
        int big = -999;
        int small = 999;
        /*
        * 랜덤함수를 이용해 10개의 수를 추출해 리스트에 저장한 후 저장된 값들 중 최대값과 최소값.*/
        LinkedList<Integer> num = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int temp = (int)(Math.random() * 30) + 1;
            num.add(temp);
            Integer val = num.get(i);
            if (val > big){
                big = val;
            }if (val < small){
                small = val;
            }
            System.out.print(" " + val );
        } System.out.println("최솟값 : " + small + " | 최댓값 : " + big);
    }
}
