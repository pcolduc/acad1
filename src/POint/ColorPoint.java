package POint;

public class ColorPoint extends Point{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint(){
        System.out.print(this.color);
        showPoint();// point 클래스의 메서드 호출.
    }
}
