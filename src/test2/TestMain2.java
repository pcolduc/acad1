package test2;

import test1.Test;

public class TestMain2 extends Test{
    public TestMain2(){
        super();
        this.protected_name = "김성현";
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.public_name = "김성현";
        System.out.println(test.public_name);

//        TestMain2 testMain2 = new TestMain2(); 상속후 접근 가능
//        testMain2.protected_name = "김성현";
//        System.out.println(testMain2.protected_name);

//        test.default_name = "김성현:";   다른패키지 이므로 접근 불가
//        System.out.println(test.default_name);

        test.setPrivate_name("김성현::");
        System.out.println(test.getPrivate_name());
    }
}
