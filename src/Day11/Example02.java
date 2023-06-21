package Day11;

import java.util.Scanner;

class MethodTest{

    public int getSum(int num1, int num2){
        return num1 + num2;
    }
    public int getSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
public class Example02 {
    public static void main(String[] args) {
        /*
        * 메소드 오버로딩과 생성자 오버로딩
        *
        * 오버로딩
        * - 자바에선 한 클래스 내에, 이름이 같지만 매개변수의 타입이나 개수가
        * 서로 다른 여러개의 메소드를 중복 작성할 수 있다.*/
        MethodTest methodTest = new MethodTest();

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("숫자 입력 : ");
        int num2 = sc.nextInt();
        System.out.println("숫자 입력 : ");
        int num3 = sc.nextInt();

        System.out.println(methodTest.getSum(num1,num2));
        System.out.println(methodTest.getSum(num1,num2,num3));
    }
}
