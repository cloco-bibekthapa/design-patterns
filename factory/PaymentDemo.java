public class PaymentDemo {
    public static void main(String[] args) {

        PaymentMethod payment = PaymentFactory.getPaymentMethod("esewa");
        
        if (payment != null) {
            payment.processPayment(500.0);
        } else {
            System.out.println("Invalid payment method.");
        }

        payment = PaymentFactory.getPaymentMethod("khalti");
        
        if (payment != null) {
            payment.processPayment(500.0);
        } else {
            System.out.println("Invalid payment method.");
        }
    }
}
