package exam;
class Jogger{
    void run(){
        System.out.println("달리기");
    }
}
//파일 이름과 동일한 클래스 이름만 public 접근제한자를 포함 할 수 있다.
public class Example02 {
    public static void main(String[] args) {
       Jogger jogger = new Jogger();
       jogger.run();
    }
}
