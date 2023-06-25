package Prac;

public class Quiz5 {
    public static void main(String[] args) {
        // 소문자는 대문자로 대문자는 소문자로
//        String s [] = {"twosome","Place"};
//        for (int i = 0; i < 2; i++) {
//            System.out.println(s[i].toUpperCase());
//        }
        String s = "twosome Place";
        char c[] ;
        c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z'){
                c[i] = (char) (c[i] + 'A'-'a');
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
            c[i] = (char)(c[i] - 'A'+'a');
            }
        }
        System.out.println(c);
    }
}
