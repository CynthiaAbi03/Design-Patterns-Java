package BehaviouralPatterns.StrategyPattern;

public interface PaymentMethod {
    void pay(double amount);
    double totalAmount(double amount);
}
