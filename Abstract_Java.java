// abstract class Absctract_Animal {
//     abstract  void makesSound();
// }


// class Cat extends Absctract_Animal {
//     @Override
//     public void makesSound() {
//         System.out.println("cat memou meou");
//     }
// }

// public class Abstract_Java {
//     public static void main(String[] args) {
//         Cat mycat = new Cat();
//         mycat.makesSound();
//     }
// }


abstract class Payment {
    abstract void PaymentMethod();

    public void process_credit() {
        System.out.println("processing payment");
    }
}

class DebitPayment extends Payment {
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