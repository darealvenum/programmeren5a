package sellers;

class PaypalAccount {
    public String email;
    public String password;
    public int balance;

    public PaypalAccount(String email, String password, int balance) {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

}

public class PaypalService implements PaymentStrategy {
    private PaypalAccount account;

    @Override
    public void collectPaymentDetails() {
        this.account = new PaypalAccount("jondoe@gmail.com", "123456", 10000);
    }

    @Override
    public boolean validate(int amount) {
        System.out.println("Validating payment details from Paypal");
        if (amount > this.account.balance) {
            return false;
        }
        return true;
    }
    @Override
    public void pay(int amount) {
       this.account.balance -= amount;
    }
}