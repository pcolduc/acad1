package dya16;

public class Example07 {
    public static void main(String[] args) {
        /*
        * charAt() : charAt() 는 문자열에서 문자 하나를 추출할 수 있는 메소드
        *
        * */
        String str1 = "abcde";
        System.out.println("str문자열의 0번째 인덱스 : " + str1.charAt(0));
        System.out.println("str문자열의 1번째 인덱스 : " + str1.charAt(1));
        System.out.println("str문자열의 2번째 인덱스 : " + str1.charAt(2));
        System.out.println("str문자열의 3번째 인덱스 : " + str1.charAt(3));
        System.out.println("str문자열의 4번째 인덱스 : " + str1.charAt(4));

        String str2 = "Hello World";
        System.out.println("str2의 5 번째 인덱스" + str2.charAt(5));

        //length() : 문자열 길이 반환
        System.out.println(str2.length());
    }
}
