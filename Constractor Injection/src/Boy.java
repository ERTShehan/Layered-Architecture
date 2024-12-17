public class Boy {
    Agreement agreement;

    public Boy(Agreement agreement){
        this.agreement = agreement;
    }

    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());
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