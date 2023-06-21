package Quiz;

import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};//멤버 변수
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {//메서드
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return kor[i] + " : " + eng[i];
            }
        }
        if (word.equals("그만")) {
           System.exit(0);
        } else {
            return word + " 는 저의 사전에 없습니다";
        }
        return "";
    }
}

    public class DictionaryMain {
        /*
         * 해당 단어를 입력받아 그 해당하는 단어의 영어 단어를 찾으세요.
         *
         * 실행 예)
         * 한영 단어 검색 프로그램 입니다.
         * 한글단어 :
         * 아기
         * 아기는 baby
         * 한영 단어 검색 프로그램 입니다
         * 한글단어
         * 돈
         * 돈 money
         * 한글단어
         * 돈줘
         * 돈줘는 저의 사전에 없습니다.
         * 그만*/
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                Dictionary dictionary = new Dictionary();
                System.out.println("한영 단어 검색 프로그램입니다.");
                System.out.println("한글단어 : ");
                String word = sc.nextLine();
                System.out.println(dictionary.kor2Eng(word));
            }
        }

    }
