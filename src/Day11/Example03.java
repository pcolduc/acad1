package Day11;
class Circle{
    public int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}

public class Example03 {
    /*
    * 객체배열
    * - 자바에서는 기본타입 데이터뿐 아니라, 객체를 원소로 하는 객체배열도
    * 만들 수 있다.
    * - 자바의 객체배열은 객체에 대한 레퍼런스를 원소로 갖는 배열
    * */
    public static void main(String[] args) {
        Circle circle[] = new Circle[5];

        for (int i = 0; i < circle.length; i++) {
            circle[i] = new Circle(i);//i번째 원소 생성
        }
        for (int i = 0; i < circle.length; i++) {
            System.out.println((int)circle[i].getArea() + " ");
        }
    }
}
