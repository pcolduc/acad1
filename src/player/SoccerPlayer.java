package player;

public class SoccerPlayer extends Player{

    int goalNum;//자식 클래스의 멤버변수 선언
    /*
    * super()
    * - 매개 값의 개수와 타입이 일치하는 부모 생성자를 호출한다.
    * - 만약 매개 값의 개수아ㅗ 타입이 일치하는 부모 생성자가 없을 경우 컴파일
    * 오류가 발생.
    * - 매개 값이 없는경우, 부모의 기본 생성자를 컴파일러가 자동으로 만들기 때문에
    * 생략해도 된다.*/

    public SoccerPlayer(String name, int age, int goalNum) {
        super(name, age);//부모클래스의 생성자를 상속. 부모클래스에 생성자가 있을때는 자식 클래스도 똑같이 생성자를 생성해야한다.
        this.goalNum = goalNum;//자식클래스
    }
}
