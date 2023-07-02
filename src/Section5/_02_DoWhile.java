package Section5;

public class _02_DoWhile {
    public static void main(String[] args) {
        //반복문 do while
        int distance = 25;//전체거리
        int move = 0 ; // 이동거리
        int height = 2;

        while (move + height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리"+ move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println("-------반복문---------");

        //키가 엄청나게 큰사람
        move = 0;
        height = 25;//distance와 hrgiht가 같기때문에 조건은 만족하지 않는다 바로 탈출
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리"+ move);
            move += 3;
    }
        System.out.println("도착했습니다.");

        System.out.println("-------반복문---------");
        //do while 반복문
        do{
            System.out.println("발차기를 게속 합니다.");
            System.out.println("현재 이동거리 : "+ move);
            move += 3;
        }while (move + height < distance);
        System.out.println("도착했습니다" );
    }
    }
