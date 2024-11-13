public class PaymentFactory {

    public static PaymentMethod getPaymentMethod(String paymentMethod) {
        if (paymentMethod == null) {
            return null;
        }
        
        if (paymentMethod.equalsIgnoreCase("Esewa")) {
            return new EsewaPayment();
        } else if (paymentMethod.equalsIgnoreCase("Khalti")) {
            return new KhaltiPayment();
        }
        
        return null;
    }
}
