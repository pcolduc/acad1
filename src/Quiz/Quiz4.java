package Prac;

public class Quiz4 {
    public static void main(String[] args) {

        int bin[] = new int[100];
        int i = 0;
        int val = 19;
        while (val > 0) {
        bin[i] = val % 2;
        val /= 2;
        i++;
        }
        i--; //19/2 9/2 4/2 2/2 1
        for (; i >= 0  ; i--) {
            System.out.print(bin[i]);
        }
    }
}