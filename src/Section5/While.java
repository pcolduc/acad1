package Section5;

public class While {
    public static void main(String[] args) {
        // 반복문  while
        int distance = 25; // 전체거리 25미터
        int move = 0; //현재 이동거리 0미터
        while (move < distance){// 현재 이동거리가 전체 거리보다 작다는 조건이 참인동안에 반복 수행.
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리"+move);
            move += 3;
        }//조건이 거짓이 되는 순간 반복문을 벗어남.
        //무브가 디스턴스 보다 작으므로 조건은 참이다 하지만 무브는 한번 실행 할 때 마다 3씩 증가하므로
        //25를 넘어서는 순간이 오면서 반복문을 벗어나게 된다.
        System.out.println("도착했습니다.");
    }
}
