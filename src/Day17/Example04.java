package Day17;

import java.util.ArrayList;
import java.util.List;

public class Example04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int temp = (int)(Math.random() * 30) + 1;
            list.add(temp);
        }
        System.out.println("전체 데이터 : " + list);
        for (int i = 0; i < list.size(); i++) {
            //list 에서 각 인덱스에 위치한 값을 가져오기
            Integer val = list.get(i);
            if (val % 2 == 0){
                System.out.println(val);
            }
        }
    }
}
