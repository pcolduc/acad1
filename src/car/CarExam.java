package car;

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car(); // 클래스를 이용해 인스턴스 생성
        System.out.println("바퀴의 개수는 "+ car.wheel);

        car.wheel = 5;// 바퀴의 개수를 5로 변경
        System.out.println("바퀴의 개수는 "+ car.wheel);

        car.ride();
        car.stop();
    }
}
