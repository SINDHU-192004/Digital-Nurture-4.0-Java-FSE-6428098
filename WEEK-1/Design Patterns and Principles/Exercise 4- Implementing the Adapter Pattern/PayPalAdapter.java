
public class PayPalAdapter implements PaymentProcessor {
    private PayPalPaymentGateway paypalGateway;

    public PayPalAdapter(PayPalPaymentGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public void processPayment(double amount) {
        paypalGateway.sendPayment(amount);
    }
}
