package Quiz;

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("수학,과학,영어 순으로 3개의 점수 입력 : ");
        int mat = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();
        Grade grade = new Grade(mat,sci,eng);
        System.out.println(grade.getAvg());
    }
}
