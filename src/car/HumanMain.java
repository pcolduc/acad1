package car;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "김성현";
        human.age = 23;
        human.address = "부산시 남구";

        System.out.println("이름 : " + human.name);
        System.out.println("나이 : " + human.age);
        System.out.println("거주지 : " + human.address);
    }
}
