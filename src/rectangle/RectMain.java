package rectangle;

import java.util.Scanner;

public class RectMain {
    public static void main(String[] args) {
        /*
        * 클래스 생성후 가로와 세로를 필드로 선언후
        * 사각형의 넓이를 구하는 메소드를 만들고*/
        Scanner sc = new Scanner(System.in);
        RectAngle rect = new RectAngle();
        System.out.println("가로 : ");
        rect.x = sc.nextInt();
        System.out.println("세로 :");
        rect.y = sc.nextInt();

        System.out.println("사각형의 면적 : " + rect.getArea());
    }
}
