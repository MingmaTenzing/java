interface Payment {
    public  void processPayment();

    public void  userName();

    public void  userId();
}


class GooglePayment implements Payment {
@Override
public void processPayment() {
    System.out.println("processing payment");

}
    @Override
    public void  userName() {
        System.out.println("mingma is user");
        
    }
    @Override
    public void  userId() {
        System.out.println("mingma is userId is 98707");
        
    }


}

public class Interface_JAVA {
    public static void main(String[] args) {
        GooglePayment mypayment = new GooglePayment();
        mypayment.processPayment();
        mypayment.userName();
        mypayment.userId();
    }
}