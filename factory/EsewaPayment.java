public class EsewaPayment implements PaymentMethod {

    public EsewaPayment(){
        System.out.println("You've chosen esewa");
    }

    public void processPayment(double amount) {
        System.out.println("Processing eSewa payment of Rs." + amount);
    }
}
