public class PixPayment implements PaymentMethod {
    private static final double TAX = PaymentType.PIX.getFee();
    private boolean isNightTime;

    public PixPayment(boolean isNightTime) {
        this.isNightTime = isNightTime;
    }

    @Override
    public double calculatePayment(double fare, double distance) {
        double nightFee = isNightTime ? 1.10 : 1.0;
        return fare * (1 + TAX) * nightFee;
    }
}
