public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(null);

        // Using credit card payment
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        paymentContext.executePayment(100.0);

        // Using PayPal payment
        paymentContext.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        paymentContext.executePayment(200.0);
    }
}