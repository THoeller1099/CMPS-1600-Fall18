public class TokenDispenser {
    private static int tokenCounterYou = 0;
    private static int tokenCounterMachine;
    private double balanceYou;

    public TokenDispenser() {
        balanceYou = 0;
        tokenCounterMachine = 20;
    }

    /**
     * @param amt amount of money you want to enter
     */
    public void enterMoney(double amt) {
        if (amt != 0.25) {
            System.out.println("Money rejected, please only enter quarters");
        }

        if (amt == 0.25) {
            if (balanceYou < 0.25) {
                System.out.println("You do not have enough money to buy a token. Please try again");
            }
            if (balanceYou >= 0.25) {
                if (tokenCounterMachine == 0) {
                    System.out.println("We have run out of tokens. We apologize for the inconvenience :(");
                }
                System.out.println("You have received 1 token. You now have " + tokenCounterYou + " tokens in your possession.");
                tokenCounterMachine = tokenCounterMachine - 1;
            }
        }
    }

    /**
     * checks to see how many tokens you own
     */
    public void checkTokens() {
        System.out.println("You have " + tokenCounterYou + " tokens in your possession");
    }

    /**
     * checks how much money you have to spend on tokens
     */
    public void checkBalance() {
        System.out.println("You have " + balanceYou + " dollars to spend on tokens");
    }

    /**
     * @param amt the amount of money you want to add to your balane
     */
    public void addBalance(double amt) {
        balanceYou = balanceYou + amt;
        System.out.println(amt + " dollars have been added to your token budget");
    }
}
