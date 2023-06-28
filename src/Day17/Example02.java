package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        /*
        * List
        * - List 는 배열과 유사한 자료구조로 중복이 허용되면서
        * 저장순서가 유지되는 구조.
        * - 배열과의 차이점은 크기에 제한이 없고, 삽입 , 삭제, 수정이 용이함
        * - List 컬렉션은 List 인터페이스를 생성하여 기능을 정의하고 하위 클래스에 상속해 그 기능을 구현하도록 한다.
        *
        * 형식)
        * List<obj> list = new ArrayList<obj>();
        * obj : 리스트에 저장할 데이터 유형
        * ArrayList : 클래스*/
        List<String> list1 = new ArrayList<>();

        list1.add("사과");
        list1.add("딸기");
        list1.add("바나나");
        System.out.println(list1);
        /*
        * int : 정수형 변수를 선언할 때 사용
        * Integer : 정수형 데이터를 객체화 시킬때 사용.*/
//        int a = null;
        Integer a1 = null;

        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        /*
        * 1. List<> list = new ArrayList<>();
        * 2. ArrayList<> list = new ArrayList<>();
        * List 는 인터페이스고 ArrayList는 이 List 를 구현한 ㅡㄹ래스
        * 그러므로 List로 선언을 한 경우 인스턴스를 ArrayList로 받을 수 있고 LinkedList로도 받을 수 있다.
        *
        * 2번째 방법으로 선언한 경우 ArrayList의 인스턴스를 만들어야하므로 ArrayList로 받아야함.*/

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("딸기");
        list3.add("사과");
        list3.add("바나나");
        System.out.println(list3);

        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList = new LinkedList<>(); 안댐.
    }
}
