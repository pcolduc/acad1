package day8;

public class Quiz2 {
    public static void main(String[] args) {
        /*
        * 주어진 2차원 배열의 전체 원소들의 합과 평균 값을 출력
        *
        * 결과)
        * 합 615
        * 평균 68.333333333*/
        int arr[][] = {
                {93,56,43},
                {83,71},
                {96,54,22,97}
        };
        int sum = 0;

       int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;

            }
            System.out.println(sum);
            double avg = sum /(double)count;
            System.out.println(avg);
        }
    }
}
