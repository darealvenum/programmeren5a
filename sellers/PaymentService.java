package sellers;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int carCost) {
        this.paymentStrategy.collectPaymentDetails();
        if (this.paymentStrategy.validate(carCost)) {
            this.paymentStrategy.pay(carCost);
        } else {
            throw new RuntimeException("Payment failed due to low balance");
        }
    }
}