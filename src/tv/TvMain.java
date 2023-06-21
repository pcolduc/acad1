package tv;

public class TvMain {
    public static void main(String[] args) {
        //자식 객체 생성
        IPTelevision ipTelevision = new IPTelevision("삼성");

        //상속된 필드 생성
        System.out.println("모델 : " + ipTelevision.model);

        //상속된 메서드 호출
        ipTelevision.powerOn();
        ipTelevision.channelChannel1(5);

        //자식 객체의 메서드 호출
        ipTelevision.settopBoxOn();
        ipTelevision.changeContents("영화");

        //부모와 자식 메서드를 자유롭게 호출
        ipTelevision.channelSound(20);
        ipTelevision.settopBocOff();
        ipTelevision.powerOff();
    }
}
