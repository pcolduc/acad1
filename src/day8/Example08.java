package day8;

public class Example08 {
    public static void main(String[] args) {
        int arr[] = {80, 50, 25, 11, 23, 41, 800, 100};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        int i[][] = new int[10][15];
        for (int j = 0; j < i.length; j++) {
            for (int k = 0; k < i[j].length; k++) {
                System.out.print(i[j][k]);
                i[j][k] += (j+1)+(k+1);
            }
            System.out.println();
        }
    }
}


