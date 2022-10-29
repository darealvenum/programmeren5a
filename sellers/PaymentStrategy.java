package sellers;

public interface PaymentStrategy {
    public void collectPaymentDetails();
    public boolean validate(int amount);
    public void pay(int amount);
}