public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "SINDHU T"));
        context.processPayment(1500.00);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("sindhu.t@example.com"));
        context.processPayment(750.50);
    }
}
