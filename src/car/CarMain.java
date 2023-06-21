package car;

public class CarMain {
    public static void main(String[] args) {
        Car1 car = new Car1();
        // 필드값 출력
        System.out.println("회사 : " + car.company);
        System.out.println("모델명 : " + car.model);
        System.out.println("색 : " + car.color);
        System.out.println("최고속도 : " + car.maxSpeed);
        System.out.println("현재속도 : " + car.speed);
        //필드값 변경
        car.speed = 60;
        System.out.println("현재속도 : "+ car.speed);
    }
}
