package Quiz;

import java.util.Scanner;

class Phone{
    //필드
   private String name;
   private String tel;
   //생성자
   public Phone(String name, String tel){
       this.name = name;
       this.tel = tel;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

public class PhoneMain {

    public static int searchName(Phone[] phone, String name){
        for (int i = 0; i < phone.length; i++) {
            if (phone[i].getName().equals(i));
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = null;
        while(true) {
            System.out.println("1. 입력|2. 검색|3. 프로그램 종료");
            System.out.println("메뉴를 선택해주세요.");
            int chose = sc.nextInt();
            if (chose == 1) {
                System.out.println("인원수 : ");
                int count = sc.nextInt();
                phones = new Phone[count];

                for (int i = 0; i < phones.length; i++) {
                    System.out.println("이름과 전화번호(이름과 전화번호 입력) : ");
                    String name = sc.next();
                    String phoneNumber = sc.next();
                    phones[i] = new Phone(name, phoneNumber);
                }
                sc.nextLine();
            } else if (chose == 2) {
                System.out.println("검색할 이름 : ");
                String search_name = sc.next();
                int index = searchName(phones, search_name);
                if (index != -1) {
                    System.out.println(phones[index].getTel() + " 입니다");
                } else {
                    System.out.println(search_name + " 이 없습니더,");
                }
            } else if (chose == 3) {
                System.exit(0);
            }
        }
    }
}
