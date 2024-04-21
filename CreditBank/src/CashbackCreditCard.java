class CashbackCreditCard extends CreditCard {
    private double spending;

    public CashbackCreditCard(double creditLimit) {
        super(creditLimit);
        this.creditLimit = creditLimit;
        this.creditBalance = creditLimit;
        this.balance = creditLimit;
        this.ownFunds = 0;
        this.spending = 0;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            ownFunds -= amount;
            spending += amount;
            if (ownFunds <= 0){
                creditBalance += ownFunds;
                ownFunds = 0;
            }
            if (spending >= 5000){
                topUp(amount * 0.05);
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