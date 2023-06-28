package Day17;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Example05 {
    public static void main(String[] args) {
        /*
        * LinkedList
        * - LinkedList 는 데이터와 다음 데이터의 주소를 가지는
        * 노드 객체가 연결 되어 데이터 를 저장 하는 자료 구조
        * - ArrayList와 마찬가지로 List컬렉션의 구현 클래스 이므로
        * 사용할 수 있는 메소드가 대부분 동일.
        * - ArrayList는 배열을 이용해 데이터를 저장하는 반면
        * LinkedList는 node 객체를 생성하여 인접 데이터를
        * 링크해서 체인처럼 관리함
        *
        * 형식)
        * LinkedList<Obj> list = new LinkedList<>();
        * List 인터페이스 외 다른 기능들도 상속하고 있어서
        * LinkedList 본연의 기능을 모두 사용할 경우엔,ㄴ
        * 기본적인 객체 선언 방식을 채택함.*/
        //List 타입을 오브젝트
        LinkedList<Object> members = new LinkedList<>();
        //new 에서 타입 파라미터 생략가능
        LinkedList<Integer> num = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,2));
        System.out.println(list2);

    }
}
