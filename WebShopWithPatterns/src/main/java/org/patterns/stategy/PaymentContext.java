package org.patterns.stategy;

// Класс контекста
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void performPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
