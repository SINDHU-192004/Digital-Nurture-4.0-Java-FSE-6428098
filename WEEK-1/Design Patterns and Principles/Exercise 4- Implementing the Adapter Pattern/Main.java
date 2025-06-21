
// Main.java
// AdapterPatternExample
// Submitted by: SINDHU.T | Superset ID: 6428098

public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePaymentGateway());
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalPaymentGateway());

        System.out.println(" Processing payments via unified interface:");
        stripeProcessor.processPayment(2500.00);
        paypalProcessor.processPayment(1450.50);
    }
}