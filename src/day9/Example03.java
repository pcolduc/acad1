package day9;

public class Example03 {
    public static void main(String[] args) {
        /*
        * 클래스
        * - 일종의 틀, 설계도 이러한 것들을 클래스 라고 한다
        * - 클래스로부터 만들어진 객체를 인스턴스라고 한다
        *
        * 객체지향 프로그래밍 개발의 단계
        * 클래스 설계 >> 인스턴스와 (클래스를 이용한 객체생성) >> 생성된 객체사용.
        * 객체간의 관계
        * - 객체는 개별적으로 사용되기도 하며, 다른 객체와의 관계를 가질 수 있다.
        * 집합관계 : 자동차는 엔지 , 타이머, 핸들 등으로 구성되므로 자동차와 이 부품들은 집합관계
        * 사용관계 : 사람은 자동차를 사용하므로 사람과 자동차는 사용관계
        * 상속관계 : 기계와 자동차는 상속관계
        * 외부 객체는 객체 내부의 구조를 알지 목하고 객체가 허가하는 필드와 메소드만 사용할 수 있다.
        *
        * 접근제어자 : private, public, default, protected
        *
        * 사람
        * 속성 >> 이름, 나이, 거주지 => 필드
        * 동작 >> 먹기, 걷기, 자기 => 메서드
        *
        * 클래스의 용도
        * - 라이브러리(API)용 : 다른클래스에서 사용할 목적으로 설계
        * - 실행용 : 프로그램의 실행 => main() 메소드를 제공하는 역할을 한다.
        * */

        //객체
        // 믈리적으로 존재하거나 추상화 되어있는 상태로 자신만의 속성을 가지고 있다.

        //물리적으로 존재하는 객체 : 사람, 비행기 ,자동차
        //추상적으로 존재하는 객체 : 강의
        Student st = new Student();// Student 클래스의 인스턴스.
        Student st1 = new Student();// Student 클래스의 인스턴스.

        System.out.println(st.toString());
        System.out.println(st1.toString());
    }
}