public class BankAccount {
    public String person_name;
    public double balance;

    public BankAccount() {
        this.person_name = "";
        this.balance = 0;
    }

    public BankAccount(String n, double b) {
        person_name = n;
        balance = b;
    }

    public String getName() {
        return person_name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance = balance + amt;
    }

    public void withdraw(double amt) {
        balance = balance - amt;
    }

    public void transfer(BankAccount other, double amt) {
        this.withdraw(amt);
        other.deposit(amt);
    }
    @Override
    public String toString() {
        return person_name + ": " + balance;
    }
}
