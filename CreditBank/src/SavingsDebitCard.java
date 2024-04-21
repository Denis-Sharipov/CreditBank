public class SavingsDebitCard extends DebitCard{
    private double savings;

    @Override
    public void topUp(double amount) {
        balance += amount;
        savings += amount * 0.00005;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Balance: " + balance + "\nSavings: " + savings;
    }
}
