public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        System.out.println("Дебетовая карта\nБаланс: ");
        System.out.println(debitCard.getBalanceInfo());
        debitCard.topUp(10000);
        System.out.println("\nПополнение на 10000\nБаланс: " + debitCard.getBalanceInfo());
        debitCard.pay(10000);
        System.out.println("\nОплата на 10000\nБаланс: " + debitCard.getBalanceInfo());

        CreditCard creditCard = new CreditCard(10000);
        System.out.println("\n\nКредитная карта");
        System.out.println(creditCard.getAvailableFundsInfo());
        creditCard.topUp(5000);
        System.out.println("\nПополнение на 5000\n" + creditCard.getAvailableFundsInfo());
        creditCard.pay(12000);
        System.out.println("\nОплата на 12000\n" + creditCard.getAvailableFundsInfo());
        creditCard.topUp(8000);
        System.out.println("\nПополнение на 8000\n" + creditCard.getAvailableFundsInfo());

        BonusPointsDebitCard bonusPointsDebitCard = new BonusPointsDebitCard();
        System.out.println("\n\nДебетовая карта с бонусными баллами");
        System.out.println(bonusPointsDebitCard.getAvailableFundsInfo());
        bonusPointsDebitCard.topUp(10000);
        System.out.println("\nПополнение на 10000\n" + bonusPointsDebitCard.getAvailableFundsInfo());
        bonusPointsDebitCard.payWithBonusPoints(1000);
        System.out.println("\nОплата на 1000 со списанием бонусов\n" + bonusPointsDebitCard.getAvailableFundsInfo());

        CashbackCreditCard cashbackCreditCard = new CashbackCreditCard(10000);
        System.out.println("\n\nКредитная карта с кэшбеком 5% от покупок при условии трат больше 5 000");
        System.out.println(cashbackCreditCard.getAvailableFundsInfo());
        cashbackCreditCard.pay(5000);
        System.out.println("\nОплата на 5000\n" + cashbackCreditCard.getAvailableFundsInfo());
        cashbackCreditCard.pay(2000);
        System.out.println("\nОплата на 2000\n" + cashbackCreditCard.getAvailableFundsInfo());

        SavingsDebitCard savingsDebitCard = new SavingsDebitCard();
        System.out.println("\n\nДебетовая карта с накоплением в размере 0.005% от суммы пополнений");
        System.out.println(savingsDebitCard.getAvailableFundsInfo());
        savingsDebitCard.topUp(100000);
        System.out.println("\nПополнение на 100000\n" + savingsDebitCard.getAvailableFundsInfo());
        savingsDebitCard.topUp(200000);
        System.out.println("\nПополнение на 200000\n" + savingsDebitCard.getAvailableFundsInfo());
    }
}
