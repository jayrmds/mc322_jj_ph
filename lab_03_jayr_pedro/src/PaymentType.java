public enum PaymentType {
    CREDIT_CARD(0.06), 
    CASH(0.0), 
    DEBIT_CARD(0.04), 
    PIX(0.01), 
    VOUCHER(0.03);

    private final double fee;

    PaymentType(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}
