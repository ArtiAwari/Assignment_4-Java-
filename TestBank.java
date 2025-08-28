abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void deposited(double amount);
    abstract void withdrawl(double amount);
    abstract void Balance();

    void getDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }


    void deposited(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }


    void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }


    void Balance() {
        System.out.println("Available Balance: " + balance);
    }
}

public class TestBank {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Arti Awari", 5000);
        acc.getDetails();
        acc.deposited(2000);
        acc.withdrawl(3000);
        acc.Balance();
    }
}
