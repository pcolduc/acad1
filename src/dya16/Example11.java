package dya16;

public class Example11 {
    public static void main(String[] args) {
        /*
        * StringBuilder()
        * - String 과 문자열 을 더할 때 새로운 객체를 생성 하는 것이 아닌 기존 데이터 에 더하는 방식을 사용 하기 때문에 속도가 빠르고
        * 상대적 으로 부하가 적다.*/
//        String str1 = "abc";
//        String str2 = "def";
//        System.out.println()
        StringBuilder str = new StringBuilder();
        str.append("hello");
        str.append(" World");
        System.out.println(str);
    }
}
