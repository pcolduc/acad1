package tv;

public class IPTelevision extends Television {
    String contents;

    //Television 클래스로부터 상속받은 필드를 그대로 사용할 수 있다.

    public IPTelevision(String model){
        this.model = model;
    }

    void settopBoxOn(){
        System.out.println("셋톱박스를 켭니다");
    }
    void settopBocOff(){
        System.out.println("셋톱박스를 끕니다");
    }
    void changeContents(String Contents){
        this.contents = contents;
        System.out.println("컨텐츠를 " + contents + "로 전환합니다");
    }
}
