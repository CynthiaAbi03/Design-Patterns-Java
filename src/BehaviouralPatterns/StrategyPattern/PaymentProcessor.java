package BehaviouralPatterns.StrategyPattern;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void ProcessPayment (double amount) {
         paymentMethod.pay(amount);
    }
}
