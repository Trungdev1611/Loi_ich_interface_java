package notUseInterface;

class Test1 {
    void runMethod() {
        System.out.println("this is runmethod in Test1 class");
    }
}

class Test2 {
    void runMethod() {
        System.out.println("this is runmethod in Test2 class");
    }
}

public class Test {
    // nếu không sử dụng interface, muốn truyền được tham số vào hàm callMethod đại
    // diện cho cả Tes1 và Test2 thì ta phải định nghĩa 2 method như sau thì trong
    // hàm main ta mới gọi được với cả tham số là đối tượng của Class Test1 và Class
    // Test2
    private static void callMethod1(Test1 test1) {
        test1.runMethod();
    }

    private static void callMethod2(Test2 test2) {
        test2.runMethod();
    }

    public static void main(String[] args) {

        Test1 obj1 = new Test1();
        Test2 obj2 = new Test2();

        // ở đây ta mới truyền được 2 tham số là Test1 và Test2
        callMethod1(obj1);
        callMethod2(obj2);
    }
}