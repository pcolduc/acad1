package Section5;

public class _01_For {
    public static void main(String[] args) {
        // 반복문 for
        for (int i = 0; i < 10; i +=2) {// 짝수 출력.
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i < 10; i += 2) {//홀수출력
            System.out.print(i);
        }
        //거꾸로 숫자
        // 54321
        System.out.println();
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }
        System.out.println();
        //1부터 10까지의 숫자들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
        sum += i;
            System.out.println("현재까지 총합은"+sum+"입니다.");
        }
        System.out.println("1부터10까지의 총합은 "+sum+"입니다. ");
    }
}
