class BonusPointsDebitCard extends DebitCard {
    private double bonusPoints;

    public BonusPointsDebitCard() {
        this.bonusPoints = 0;
    }


    @Override
    public void topUp(double amount) {
        balance += amount;
        bonusPoints += amount * 0.01;
    }

    public boolean payWithBonusPoints(double amount) {
        if (balance >= amount) {
            balance -= (amount - bonusPoints);
            bonusPoints = 0;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Balance: " + balance + "\nBonus points: " + bonusPoints;
    }
}