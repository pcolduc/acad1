package player;

public class Player {
    String name;
    int age;

    public Player(String name, int age){//멤버변수 초기화 할 생성자 생성.
        this.name = name;//매개변수로 받는 name과 age 는 결국 Player의 멤버변수에 저장 된다.
        this.age = age;
    }
}
