package Quiz;

public class Member {
   private String id;
   private String name;
   private int point;

   Member(String id, String name, int point){
       this.id = id;
       this.name = name;
       this.point = point;
   }


    public void show(){
        System.out.println("id : " + this.id);
        System.out.println("이름 : " + this.name);
        System.out.println("포인트 : " + this.point);
    }
}
