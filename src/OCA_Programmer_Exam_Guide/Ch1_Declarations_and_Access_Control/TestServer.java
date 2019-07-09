package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
// p. 56
class TestServer {
    int count = 9;
    public void logIn() {
        int count = 10;
        System.out.println("Local variable count is " + count);
    }

    public void count() {
        System.out.println("Instance variable count is " + count);
    }

    public static void main(String[] args) {
        new TestServer().logIn();
        new TestServer().count();
    }
}
