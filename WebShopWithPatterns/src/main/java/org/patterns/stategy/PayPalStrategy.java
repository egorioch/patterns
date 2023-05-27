package org.patterns.stategy;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " с помощью PayPal");
        // Здесь был бы код для выполнения платежа с использованием PayPal
        // Типа вычет средств из баланса пользователя, отправка на почту уведомления о заказе
    }
}
