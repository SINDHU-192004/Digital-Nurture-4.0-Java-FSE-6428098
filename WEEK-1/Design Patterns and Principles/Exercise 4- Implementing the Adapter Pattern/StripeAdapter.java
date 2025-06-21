
public class StripeAdapter implements PaymentProcessor {
    private StripePaymentGateway stripeGateway;

    public StripeAdapter(StripePaymentGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.makeStripePayment(amount);
    }
}
