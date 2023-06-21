package book;

public class BookMain {
    public static void main(String[] args) {
        // Comic 클래스에서 구현하지 않은 멤버와 메소드 들이지만 Book에 있는 요소들을
        // 사용할 수 있다. (Book 클래스를 상속 받았기 때문에)
        Comic comic = new Comic();
        comic.title = "포켓몬";
        comic.price = 4500;
        comic.info();
    }
}
