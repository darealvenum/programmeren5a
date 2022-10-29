package sellers;

class CreditCard {
    public String number;
    public String date;
    public String cvv;
    public String name;
    public int amount;

    public CreditCard(String number, String date, String cvv, String name, int amount) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.name = name;
        this.amount = amount;
    }
}

public class CreditcardService implements PaymentStrategy {
    private CreditCard card;

    public void collectPaymentDetails() {
        card = new CreditCard("1234567890123456", "12/12", "123", "John Doe", 10000);
    }

    public boolean validate(int amount) {
        System.out.println("Validating payment details from Credit Card");
        if (amount > card.amount) {
            return false;
        }
        return true;
    }

    public void pay(int amount) {
        this.card.amount -= amount;
    }

    
}