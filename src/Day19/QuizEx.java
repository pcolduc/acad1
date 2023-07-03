package Day19;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class QuizEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "c:/upload/전화번호부.txt";
        File file = new File(filePath);
        try {
            FileWriter in = new FileWriter(file);
            while (true){
                String line = sc.nextLine();
                if (line.equals("그만")){
                    break;
                }
                in.write(line, 0 ,line.length());
                in.write("\r\n",0,2);
            }
            in.close();
            System.out.println(file.getAbsolutePath()+"에 저장했음");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
