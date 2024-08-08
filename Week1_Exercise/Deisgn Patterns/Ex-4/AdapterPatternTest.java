public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create adapters for different payment gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPalGateway);

        StripeGateway stripeGateway = new StripeGateway();
        StripeAdapter stripeAdapter = new StripeAdapter(stripeGateway);

        // Process payments using adapters
        payPalAdapter.processPayment("Credit Card", 100.0);
        stripeAdapter.processPayment("Debit Card", 50.0);
    }
}