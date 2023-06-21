package day8;

public class Example09 {
    public static void main(String[] args) {
        /*
        * 배열에서 단어만 추출하여 출력하기
        *
        * 결과 love*/
        char cards[] = {'1','L','2','O','3','V','4','E'};

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] >= 65 && cards[i] <= 90){
                System.out.printf("%c",cards[i]);
            }
        }
    }
}
