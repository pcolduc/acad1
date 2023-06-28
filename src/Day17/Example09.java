package Day17;

import java.util.HashMap;
import java.util.Hashtable;

public class Example09 {
    public static void main(String[] args) {
        /*
        * HashMap, HashTable
        *
        * HashMap : 단일스레드 환경에서 사용하기 좋은 자료구조
        * HashTable : 멀티스레드 환경에서 사용하기 좋은 자료구조
        * 해쉬테이블은 key 값을 null 로 설정 불가.*/
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("apple", "사과");
        map1.put("banana", "바나나");
        map1.put("grape", "포도");
        map1.put(null, "사과");
        map1.put("coffee", "커피");

        System.out.println(map1);

        Hashtable<String, String> map2 = new Hashtable<>();
        map2.put("apple", "사과");
        map2.put("banana", "바나나");
        map2.put("grape", "포도");
//        map2.put(null, "사과");
        map2.put("coffee", "커피");
        System.out.println(map2);
    }
}
