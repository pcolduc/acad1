package day18;

import java.awt.*;

public class Example06 {
    /*
    * 멀티스레드를 이용한 경우
    * - 동시 작업이 가능한다
    * */
    class BeepoTask implements Runnable{

        @Override
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
//        Runnable beepoTask = new BeepoTask();
//        Thread thread = new Thread(beepoTask);
//        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
