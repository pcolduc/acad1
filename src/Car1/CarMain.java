package Car1;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("에셈5");
        System.out.println("회사명 : " + car1.company);
        System.out.println();

        Car car2 = new Car("SM5","검정");
        System.out.println("회사명 : " + car2.company);
        System.out.println("모델명 : " + car2.model);
        System.out.println("색상 : " + car2.color);
        System.out.println();

        Car car3 = new Car("SM5","흰색",200);
        System.out.println("회사명 : " + car3.company);
        System.out.println("모델명 : " + car3.model);
        System.out.println("색상 : " + car3.color);
        System.out.println("최고속도 : " + car3.maxSpeed);
        System.out.println();


    }
}
