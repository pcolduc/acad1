package dya16;

public class Example09 {
    public static void main(String[] args) {
        //replace(), replaceAll() 메소드는 특정 문자 및 문자열을 원하는 단어로 변경해준다.

        String str = "자바 프로그래밍은 어렵지만 자바는 이상하다.";

        String newStr = str.replaceAll("자바","java");
        System.out.println(newStr);
    }
}
