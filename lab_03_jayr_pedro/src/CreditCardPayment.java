public class CreditCardPayment implements PaymentMethod {
    private static final double TAX = PaymentType.CREDIT_CARD.getFee();
    private boolean isNightTime;

    public CreditCardPayment(boolean isNightTime) {
        this.isNightTime = isNightTime;
    }

    @Override
    public double calculatePayment(double fare, double distance) {
        double nightFee = isNightTime ? 1.10 : 1.0;  // Aumenta 10% durante o horário noturno
        return fare * (1 + TAX) * nightFee;
    }
}
