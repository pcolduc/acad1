package Day17;

import java.util.HashMap;
import java.util.Scanner;

public class Example07 {
    /*
    * Map
    * - Key(키), Value(값)으로 구분하여 데이터를 저장하는 방식
    * - Map의 구현 클래스로는 HashMap, LinkedHashMap, HashTable
    * - 키값은 중복이 불가능 value 값은 중복이 가능
    * - HashMap은 데이터의 순서가 보장되지 않는다.
    * - HashMap의 순서를 보장하고 싶은 경우 LinkedHashMap을 활용하면 됨.*/
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();

        //dic에 저장
        dic.put("apple", "사과");// 키값은 apple 밸류값은 사과
        dic.put("banana", "바나나");// 이하동문.
        dic.put("grape", "포도");// 이하동문.

        //사용자로부터 영어 단어를 입력받고 한글단어 겁색"exit" 를 입력 받으셈

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("찾을 단어.");
            String find_word = sc.next();
            if (find_word.equals("exit")){
                System.out.println("종료");
                break;
            }
            String word = dic.get(find_word);
            if (word == null){
                System.out.println("업는 단어입니다.");
            }else {
                System.out.println(word);
            }
        }
    }
}
