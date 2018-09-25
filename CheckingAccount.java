public class CheckingAccount extends BankAccount{
    private static int transactionCount;
    private static final double TRANSACTION_FEE = 3.0;
    public CheckingAccount() {
        balance = 0;
        person_name = "";
        transactionCount = 0;
    }

    public CheckingAccount(String n, double b) {
        balance = b;
        person_name = n;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void deductFees() {
        balance = balance - (transactionCount * TRANSACTION_FEE);
        transactionCount = 0;
    }

    @Override
    public void deposit(double amt) {
        super.deposit(amt);
        transactionCount = transactionCount + 1;
    }

    @Override
    public void withdraw(double amt) {
        super.withdraw(amt);
        transactionCount = transactionCount + 1;
    }
}
