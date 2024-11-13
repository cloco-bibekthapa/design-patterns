public class KhaltiPayment implements PaymentMethod {

    public KhaltiPayment(){
        System.out.println("You've chosen khalti");
    }

    public void processPayment(double amount) {
        System.out.println("Processing Khalti payment of Rs." + amount);
    }
}
