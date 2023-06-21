package test1;

public class TestMain1 {
    public static void main(String[] args) {
        Test test = new Test();

        //public 접근
        test.public_name = "김성현";
        System.out.println(test.public_name);

       // protected 접근
        test.protected_name = "김성현";
        System.out.println(test.protected_name);

        //default 접근
        test.default_name = "김성현:";
        System.out.println(test.default_name);

        test.setPrivate_name("김성현::");
        System.out.println(test.getPrivate_name());
    }
}
