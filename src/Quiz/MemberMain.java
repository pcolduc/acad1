package Quiz;

import java.security.interfaces.RSAKey;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        //private 를 많이 사용함 메서드는 default public 으로 많이 사용함.
        /*
        * 회원 (Member) 클래스는 회원 아이디를 나타내는 id(문자열)과
        * 회원 이름을 나타내는 name(문자열), 회원의 포인트를 나타네는 point (정수)
        * 필드를 가지고 있다
        *
        * 메소드는 각 회원의 필드의 값들을 변경 혹은 입력하는 set 메소드의 이를 반환하는 get 메소드를
        * 가지고 있다
        *
        * 모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻지 못하도록 private
        * 로 접근 제한을 막으세요*/
        Member member = new Member("rrrr", "김성현",20000);
        member.show();


    }


}
