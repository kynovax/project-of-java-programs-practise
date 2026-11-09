//Create an outer class for a real-world object (for example Order, BankAccount, or Hotel) with at least one private field.
interface Notifier {
    void sendNotification();
}
class BankAccount {
    private double balance = 5000;
    class AccountManager {
        void displayBalance() {
            System.out.println("Current Balance: " + balance);
        }
        void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
            System.out.println("Updated Balance: " + balance);
        }
    }
    static class Receipt {
        void printReceipt() {
            System.out.println("Bank Receipt Generated Successfully.");
        }
    }
       void notifyCustomer(Notifier notifier) {
        notifier.sendNotification();
    }
}


public class program21 {

    public static void main(String[] args) {       
        BankAccount account = new BankAccount();
        BankAccount.AccountManager manager =
                account.new AccountManager();
        System.out.println("----- ACCOUNT DETAILS -----");
        manager.displayBalance();
        manager.deposit(2000);
        System.out.println("---------------------------");      
        BankAccount.Receipt receipt =
                new BankAccount.Receipt();
        receipt.printReceipt();
        System.out.println("---------------------------");
        Notifier notification = new Notifier() {
            @Override
            public void sendNotification() {
                System.out.println(
                    "Notification: Your deposit was successful."
                );
            }
        };     
        account.notifyCustomer(notification);
        System.out.println("---------------------------");
    }
}
