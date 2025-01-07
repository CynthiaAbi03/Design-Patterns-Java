package BehaviouralPatterns.StrategyPattern.implementation;

import BehaviouralPatterns.StrategyPattern.PaymentMethod;

public class MobilePayment implements PaymentMethod {
    private final double feePercentage = 0.20;

    @Override
    public double totalAmount(double amount) {
        return amount + (amount * feePercentage);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "*" + feePercentage + "=" + totalAmount(amount) + " using Mobile Money.");
    }
}

