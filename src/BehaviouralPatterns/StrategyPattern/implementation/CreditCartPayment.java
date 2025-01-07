package BehaviouralPatterns.StrategyPattern.implementation;

import BehaviouralPatterns.StrategyPattern.PaymentMethod;

import javax.swing.*;

public class CreditCartPayment implements PaymentMethod {
    private final double feePercentage = 0.01;

    @Override
    public double totalAmount (double amount) {
        return amount + (amount * feePercentage);
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "*" + feePercentage + "=" + totalAmount(amount) + " using Credit Card.");
    }
}
