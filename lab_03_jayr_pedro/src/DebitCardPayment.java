public class DebitCardPayment implements PaymentMethod {
    private static final double TAX = PaymentType.DEBIT_CARD.getFee();
    private boolean isNightTime;

    public DebitCardPayment(boolean isNightTime) {
        this.isNightTime = isNightTime;
    }

    @Override
    public double calculatePayment(double fare, double distance) {
        double nightFee = isNightTime ? 1.10 : 1.0;
        return fare * (1 + TAX) * nightFee;
    }
}

