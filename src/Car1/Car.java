package Car1;

public class Car {
    String company = "삼성자동차";
    String model ;
    String color;
    int maxSpeed;

    Car(){//생성자 오버로딩

    }
    Car(String model){
        this.model = model;
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
