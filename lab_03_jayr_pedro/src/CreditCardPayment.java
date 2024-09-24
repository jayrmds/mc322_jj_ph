public class CreditCardPayment implements PaymentMethod {
    private static final double TAX = 0.06;

    @Override
    public double calculatePayment(double fare, double distance) {
        return fare + (fare * TAX);
    }
}
