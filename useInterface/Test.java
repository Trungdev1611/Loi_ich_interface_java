package useInterface;

interface TestfotAll {//khai báo method runmethod ở interface để  các class khác nhau kế thừa nó, Method này không triển khai phần body mà chỉ khai báo chung chung => tính trừu tượng
    void runMethod();
}
/*các class Test1 Test2 triển khai interface theo các cách khác nhau, và khi tạo đối tượng test1, test2 ta dùng
   TestfotAll obj1 = new Test1(); //thay vì Test1 obj1 = new Test1()
   TestfotAll obj2 = new Test2(); //thay vì Test2 obj2 = new Test2()
   để tạo đối tượng, trong method callMethod ta không truyền cụ thể đối tượng nào mà truyền TestfotAll
private static void callMethod(TestfotAll testforAll) {
        testforAll.runMethod();
    } làm cho code linh hoạt hơn
=> thể hiện tính đa hình */
   
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

        TestfotAll obj1 = new Test1();
        TestfotAll obj2 = new Test2();

        // ở đây ta muốn truyền test1 hay test2 thì tùy vì cả 2 chúng đều triển khai từ
        // TestfotAll
        callMethod(obj1);
        callMethod(obj2);
    }
}
