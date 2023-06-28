package Day17;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.print("입력 : ");
            String word = sc.nextLine();
            String nword = "";
            if (word.equals("end")||word.equals("END")){
                break;
            }
            for (char a: word.toCharArray()) {
                if (Character.isLowerCase(a)){
                    nword = nword +Character.toUpperCase(a);
                }else {
                    nword = nword +Character.toLowerCase(a);
                }
            }
            System.out.println(nword);
            System.out.println();
        }
    }
}
