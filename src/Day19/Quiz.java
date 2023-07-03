package Day19;

import java.io.FileWriter;
import java.util.Scanner;

public class Quiz {
    /*
    * Scanner로 입력 받은 이름과 전화번호를 한줄에 한 사람씩
    * 경로에 저장 "그만" 을 입력하면 프로그램 종료
    *
    * 실행)
    * 전화번호 입력 프로그램입니다.
    * 이름 전화번호 >> 윤준형 010-5555-4444
    * 이름 전환번호 >> 김땡떙 010-3333-4444
    * 이름 전환번호 >> 김땡떙 010-3333-4444
    * C:pload\파일 경로*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("전화번호 입력 프로그램 입니다.");
       try {FileWriter fileWriter = new FileWriter("C:/upload/전화번호부.txt");
           while (true){
               System.out.println("이름 전화번호 : ");
               String numName = sc.nextLine();
               if (numName.equals("그만")){
                   System.out.println("종료 합니다.");
                   break;
               }
               fileWriter.write(numName + System.lineSeparator());
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
