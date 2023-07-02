package Section5;

public class _04_MutipleTable {
    public static void main(String[] args) {
        //구구단
        //2*2=2
        //2*3=6이중 반복문 사용
        System.out.println("곱한 값 : ");
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j <10 ; j++) {
                int num = i*j;
                System.out.println(i+" * "+j+" = "+num);
            }
            System.out.println(   );


        }
    }
}
