package Quiz;

public class Tv {
    String model;
    int year;
    int inc;
    Tv(String model, int year, int inc){
        this.model = model;
        this.year = year;
        this.inc = inc;
    }
    public void show(){
        System.out.println(this.model + "에서 만든 " + this.year + "년형 " + this.inc + "인치 Tv");
    }
}
