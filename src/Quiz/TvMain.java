package Quiz;

public class TvMain {
    public static void main(String[] args) {
        /*
        * 다음 main()메소드를 실행 시켰을때
        * 다음과같이 출력되는 Tv 클래스를 작성
        *
        * Lg에서 만든 2017susgud 32인치 TV*/
        Tv tv = new Tv("LG",2017,32);
        tv.show();
    }
}
