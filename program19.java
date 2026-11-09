//Create an abstract class that represents a general real-world thing (for example Payment, Employee, Vehicle, or Shape)

abstract class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }    
    abstract void pay();    
    void printReceipt() {
        System.out.println("Payment Receipt");
        System.out.println("Amount: " + amount);
    }
}
class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }
    @Override
    void pay() {
        System.out.println("Payment done using UPI.");
    }
}
class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }
    @Override
    void pay() {
        System.out.println("Payment done using Debit/Credit Card.");
    }
}

class CashPayment extends Payment {

    CashPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Payment done using Cash.");
    }
}

public class program19 {
    public static void main(String[] args) {
        Payment[] payments = {
            new UPIPayment(1000),
            new CardPayment(2000),
            new CashPayment(500)
        };
        for (Payment p : payments) {
            p.pay();
            p.printReceipt();
            System.out.println("----------------");
        }
    }
}














