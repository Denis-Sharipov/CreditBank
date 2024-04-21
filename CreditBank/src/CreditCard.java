class CreditCard extends BankCard {
    protected double creditLimit;
    protected double creditBalance;
    protected double ownFunds;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
        this.creditBalance = creditLimit;
        this.balance = creditBalance;
        this.ownFunds = 0;
    }

    @Override
    public void topUp(double amount) {
        if (balance >= creditLimit) {
            balance += amount;
            ownFunds += amount;
        }
        else {
            balance += amount;
            if ((creditBalance + amount) > creditLimit){
                ownFunds += creditBalance + amount - creditLimit;
                creditBalance = creditLimit;
            }
            else {
                creditBalance += amount;
            }
        }
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            ownFunds -= amount;
            if (ownFunds < 0){
                creditBalance += ownFunds;
                ownFunds = 0;
            }
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Credit limit: " + creditLimit + "\nCredit balance: " + creditBalance + "\nOwn funds: " + ownFunds;
    }
}