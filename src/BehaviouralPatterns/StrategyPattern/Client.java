package BehaviouralPatterns.StrategyPattern;

import BehaviouralPatterns.StrategyPattern.implementation.CreditCartPayment;
import BehaviouralPatterns.StrategyPattern.implementation.MobilePayment;
import BehaviouralPatterns.StrategyPattern.implementation.PayPalPayment;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCartPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod mobile = new MobilePayment();

        paymentProcessor.setPaymentMethod(creditCard);
        paymentProcessor.ProcessPayment(19000);

        paymentProcessor.setPaymentMethod(paypal);
        paymentProcessor.ProcessPayment(19000);


        paymentProcessor.setPaymentMethod(mobile);
        paymentProcessor.ProcessPayment(19000);


    }
}
