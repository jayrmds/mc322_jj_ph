public class CashPayment implements PaymentMethod {
    @Override
    public double calculatePayment(double fare, double distance) {
        return fare;  // Pagamento em dinheiro sem taxas adicionais
    }
}
