package Day17;

import java.util.HashMap;

public class Example08 {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreMap = new HashMap<>();

        //5개의 점수 저장.
        scoreMap.put("김길동",97);
        scoreMap.put("홍길동",96);//fcm 백그라운드 포그라운드
        scoreMap.put("박길동",95);
        scoreMap.put("유길동",92);
        scoreMap.put("이길동",91);

        System.out.println("HashMap의 요소 개수 : " + scoreMap.size());
        System.out.println("학생들의 점수 : ");
        for (String key : scoreMap.keySet()) {
            Integer value = scoreMap.get(key);
            System.out.println(key + " : "+ value);
        }
    }
}
