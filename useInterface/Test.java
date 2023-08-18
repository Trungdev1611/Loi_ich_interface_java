package useInterface;

interface TestfotAll {
    void runMethod();
}

class Test1 implements TestfotAll {

    @Override
    public void runMethod() {
        System.out.println("this is runmethod in Test1 class");
    }
}

class Test2 implements TestfotAll {

    @Override
    public void runMethod() {
        System.out.println("this is runmethod in Test2 class");
    }

}

public class Test {
    // sử dụng interface thay vì khai báo tham số cụ thể là Test1 test1 hay Test2
    // test2 thì ta chỉ cần sử dụng TestfotAll testforAll và khai báo chỉ 1 method
    // callMethod, và lúc gọi hàm thì truyền đối số khác nhau

    private static void callMethod(TestfotAll testforAll) {
        testforAll.runMethod();
    }

    public static void main(String[] args) {

        Test1 obj1 = new Test1();
        Test2 obj2 = new Test2();

        // ở đây ta muốn truyền test1 hay test2 thì tùy vì cả 2 chúng đều triển khai từ
        // TestfotAll
        callMethod(obj1);
        callMethod(obj2);
    }
}