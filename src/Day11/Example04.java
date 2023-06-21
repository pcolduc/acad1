package Day11;

import java.util.Scanner;

class Book{//메소드를 통해 변경 사용
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
public class Example04 {
    public static void main(String[] args) {
        Book book[] = new Book[2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < book.length; i++) {
            System.out.println("제목 : ");
            String title = sc.nextLine();
            System.out.println("저자 : ");
            String author = sc.nextLine();

            book[i] = new Book(title,author);
        }
        for (int i = 0; i < book.length; i++) {
            System.out.println("(" + book[i].getTitle() + "," + book[i].getAuthor() + ")");
        }
    }
}
