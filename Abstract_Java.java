
// it works as a like a interface in typescript
//it used to hide things but is accessible when its inherited.
// so in abstract class you define a method abstract
abstract class Payment {
    //abstract method don't have body
    abstract void PaymentMethod();

    //here this is a normal method
    public void process_credit() {
        System.out.println("processing payment");
    }
}


// in order to use the abstract class you have to always extend the class 
// cause you cannot create an object using abstract class.
class DebitPayment extends Payment {
    //override the parent class methods
    @Override
    public void PaymentMethod() {
        System.out.println("this is debit payment");
     }
}

public class Abstract_Java {
    public static void main(String[] args) {
        DebitPayment newdebit = new DebitPayment();
        newdebit.PaymentMethod();
        newdebit.process_credit();

  

    }


}