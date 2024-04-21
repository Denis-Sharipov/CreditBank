abstract class BankCard {
    protected double balance;

    public BankCard() {
        this.balance = 0;
    }

    public abstract void topUp(double amount); //Пополнить.

    public abstract boolean pay(double amount); //Оплатить.

    public double getBalanceInfo() { //Получить информацию о балансе.
        return balance;
    }

    public abstract String getAvailableFundsInfo(); //Получить информацию о доступных средствах.

}