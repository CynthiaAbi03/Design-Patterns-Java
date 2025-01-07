package BehaviouralPatterns.StrategyPattern.implementation;

import BehaviouralPatterns.StrategyPattern.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
    private final double feePercentage = 0.05;  // 5% fee for PayPal

    @Override
    public double totalAmount(double amount) {
        return amount + (amount * feePercentage);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "*" + feePercentage + "=" + totalAmount(amount) + " using PayPal.");
    }
}
