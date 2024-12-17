public class Boy {
    Agreement agreement;

    public void setInjection(Agreement agreement){
        this.agreement = agreement;
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setInjection(new Girl());
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