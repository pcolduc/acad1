package dya16;

public class Example05 {
    /*
    * hashCode
    * 객체를 식별하는 Integer 값
    * - 객체가 갖고 있는 데이터를 어떤 알고리즘에 적용하여 께산된
    * 정수 값을 hashCode 라 한다
    * - hashCode가 다르면 두개의 객체가 같지 않다
    * - hashCode가 같으면 두개의 객체가 같거나 다를 수 있다.
    * 주솟값 */
    public static void main(String[] args) {
        String st1 = "hello";
        String st2 = "hello";
        String st3 = "apple";

        System.out.println("str1 hashCode : "+ st1.hashCode());
        System.out.println("str2 hashCode : "+ st2.hashCode());
        System.out.println("str3 hashCode : "+ st3.hashCode());
    }
}
