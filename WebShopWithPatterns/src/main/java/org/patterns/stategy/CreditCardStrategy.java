package org.patterns.stategy;

// Конкретные стратегии платежей
class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCardStrategy(String cardNumber, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with credit card");
        // Здесь был бы код для выполнения платежа с использованием кредитной карты
    }
}
