package Section5;

import java.lang.module.FindException;

public class _06_Continue {
    public static void main(String[] args) {
        //continue

        //치킨 주문 손님중 노쇼 손님이 있을 경우.
        //for
        int max = 20;//최대 치킨 판매수량
        int sold = 0;//현재 치킨 판매 수량
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+"번 손님 주문하신 치킨 나왔습니다.");

            //손님이 없다면? 노쇼
            if (i == noShow){
                System.out.println(i+"번 손님 노쇼로 인해 다음손님에게 기회가 넘어갑니다.");
            continue;
            }
            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
            break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("_-------------------------_");
        //while 문

        int hum = 0;
        int chi = 0;
        int Max = 20;
        int not = 18;

        while (hum<=50){
            hum++;
            System.out.println(hum + "번 손님 주문하신 치킨 나왔습니다.");

            if (hum == not){
                System.out.println(hum + "번 손님 노쇼로 인해 기회가 넘어갑니다.");

                continue;
            }chi++;
            if (chi == Max){
                System.out.println("금일재료가 모두 소진되어 영업을 종료합니다");
            break;
            }
        }
    }
}
