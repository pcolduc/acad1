package tv;

public class Television {
    String model;
    int channel;
    int volume;

    void powerOn(){
        System.out.println("Tv를 켭니다");
    }
    void powerOff(){
        System.out.println("Tv를 끕니다");
    }
    void channelChannel1(int channel){
        this.channel = channel;
        System.out.println("채널을" + channel + "번으로 변경합니다");
    }
    void channelSound (int volume){
        this.volume = volume;
        System.out.println("소리를" + volume + " 으로 조정합니다.");
    }
}
