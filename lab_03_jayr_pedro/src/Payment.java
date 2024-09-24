public class Payment {
    private String paymentMethod;

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        if (paymentMethod.equals("Credit Card") || paymentMethod.equals("Cash") || paymentMethod.equals("Debit Card")) {
            System.out.println("Forma de pagamento aceita.");
        } else {
            System.out.println("Forma de pagamento não reconhecida!");
        }
    }
}
