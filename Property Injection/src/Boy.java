public class Boy {
    Agreement agreement = new Girl();

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.test();
        boy.test1();
    }

    public void test(){
        agreement.chat();
    }

    public void test1(){
        agreement.chat();
    }
}
