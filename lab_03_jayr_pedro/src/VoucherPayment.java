public class VoucherPayment implements PaymentMethod {
    private static final double TAX = PaymentType.VOUCHER.getFee();
    private boolean isNightTime;

    public VoucherPayment(boolean isNightTime) {
        this.isNightTime = isNightTime;
    }

    @Override
    public double calculatePayment(double fare, double distance) {
        double nightFee = isNightTime ? 1.10 : 1.0;  // Aumenta 10% durante o horário noturno
        return fare * (1 + TAX) * nightFee;
    }
}
