public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount() {
        interestRate = 0;
        balance = 0;
        person_name = "";
    }

    public SavingsAccount(String n, double b, double i) {
        balance = b;
        person_name = n;
        interestRate = i;
    }

    public void addInterest() {
        double interest = interestRate * balance;
        this.deposit(interest);
    }
}
