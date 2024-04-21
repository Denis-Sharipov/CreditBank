public class DebitCard extends BankCard {

    @Override
    public void topUp(double amount) {
        balance += amount;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Balance: " + balance;
    }
}
