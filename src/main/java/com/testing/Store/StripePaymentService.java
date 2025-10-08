package com.testing.Store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Simulate payment processing
        System.out.println("Stripe");
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
