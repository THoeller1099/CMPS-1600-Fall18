public class BankAccountTest {

    public static void main(String[] args) {
        SavingsAccount tedsSavings = new SavingsAccount("Ted", 0, 0.01);
        CheckingAccount bobsChecking = new CheckingAccount("Bob", 500);
        //does basic transactions with both accounts
        tedsSavings.deposit(1000);
        bobsChecking.withdraw(100);
        tedsSavings.transfer(bobsChecking, 200);
        //prints the two accounts after transactions are done
        System.out.print(bobsChecking.toString());
        System.out.print(tedsSavings.toString());
        //functions specific to the account subclasses run
        tedsSavings.addInterest();
        bobsChecking.deductFees();
        //prints the two accounts again to ensure the functions have been completed correctly
        System.out.print(bobsChecking.toString());
        System.out.print(tedsSavings.toString());
    }
}
