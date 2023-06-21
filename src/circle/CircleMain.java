package circle;

import exam.Example04;

public class CircleMain {
    public static void main(String[] args) {
        Circle pizza;//인스턴스 변수 선언
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "불고기 피자";

        System.out.println(pizza.name + " 의 면적은 " + pizza.getArea());

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "플레인 베이글";
        double area = donut.getArea();
        System.out.println(donut.name + " 의 면적은 " + area);
    }
}
