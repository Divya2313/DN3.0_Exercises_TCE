public class StripeGateway {
    public void chargeWithStripe(String paymentMethod, double amount) {
        System.out.println("Charged " + amount + " using Stripe with " + paymentMethod);
    }
}