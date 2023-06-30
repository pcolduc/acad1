package day18;

import java.io.FileWriter;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        /*
        * 파일쓰기
        * FileReader*/
        Scanner sc = new Scanner(System.in);

        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("C:\\Upload2");
            while(true){
                String line = sc.nextLine();
                if (line.length() == 0){
                    break;
                }
            }
            fout.;
        }
    }
}
