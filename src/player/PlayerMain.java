package player;

public class PlayerMain {
    public static void main(String[] args) {
        SoccerPlayer player = new SoccerPlayer("김성현", 23,13);
        System.out.println("이름 : " + player.name);
        System.out.println("나이 : " + player.age);
        System.out.println("골 수 : " + player.goalNum);
    }
}
