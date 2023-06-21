package day9;

public class Student {
    //필드 객체의 데이터가 저장된다
    String name;
    //생성자(Constructor) : 객체 생성시 초기화 역할.
    //new 연산자로 객체가 생성될 때 호출된다. 클래스의 이름으로 되어있고 반환타입은 없다.
    Student(){

    }

    //메소드 : 객체의 행위 (동작) 에 해당한다
    //객체간에 데이터를 전달의 수단으로도 사용한다

    void study(){
        System.out.println("공부한다");
    }

    }

