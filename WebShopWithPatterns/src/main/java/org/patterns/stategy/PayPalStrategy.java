package org.patterns.stategy;

class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with PayPal");
        // Здесь был бы код для выполнения платежа с использованием PayPal
    }
}
